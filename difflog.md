# Diff Log of things changed in interfaces
This list specifies all changes that have been done to the classdiagram since the hand in of the final report. This includes the addition of sysops and interfaces as well as minor changes of spelling and clarification of names.

+ 2015-12-18: Added `IFacilities` interface to `facilities` packages.
+ 2015-12-18: Fixed relationship between `Room` and `RoomAttribute`:s.
+ 2015-12-18: Fixed generics in `And`, `Or`, `Not`, `MatchesCriteria` in that `? extends SRT` and `? extends IN` was wrong for properties, so it now takes `SRT` & `IN`.
+ 2015-12-18: Added return types to methods in `IFacilities`.
+ 2015-12-26: Fixed generics in `SearchQuery, SearchCriteria<? extends SRT> => SearchCriteria<SRT>`.
+ 2015-12-29: Fixed generics in `SearchCriteria, SearchResult: ? extends SRT => SRT`.
+ 2015-12-29: Added `Guest`:s to `RoomBooking` - was omitted by mistake prior.
+ 2015-12-29: Added `Services` to `RoomBooking` - omitted by mistake prior.
+ 2015-12-29: Added `ServiceBlueprint`:s to `PreBooking`.
+ 2015-12-30: Fixed `Client -> Invoice` aggregation, now `1:0..*`, was a mistake in class diagram.
+ 2015-12-30: Added `Invoice::totalPrice`, omitted by mistake prior.
+ 2015-12-31: Added `Blacklist` to `Hotel` interface.
+ 2016-12-01: Fixed relationship between `Service` and `ServiceConsumer`, now a `classifier` and `1` as multiplicity.
+ 2016-01-02: Changed relationshionship between `RealPerson` to `Guest` and `Employee`.
+ 2016-01-02: Changed sysop `takeBackKey` to take parameter `Identity`.
+ 2016-01-02: Fix `Blacklist` method in `Hotel` interface.
+ 2016-01-02: Add reason parameter to `addIdentityToBlacklist` sysop
+ 2016-01-03: Added `id` property to `Order`, `RoomBooking` for searchability.
+ 2016-01-03: Added relationship between `Order` and `Customer`.
+ 2016-01-03: `List<SearchResult<PreOrder>> searchAvailableOrders( SearchQuery<PreOrder> query )` changed to `List<SearchResult<PreBooking>> searchAvailableBookings( Date from, Date to, SearchQuery<PreBooking> query )`
+ 2016-01-03: To pay for an `Order` the `Client` now gives his or her name instead of the system asking for an `Order` or `Service`. Should be changed in the UC and any other occurrences in the report.
+ 2016-01-03: Added system operation for searching for `Order`s associated with a `Customer`'s name.
+ 2016-01-03: Added getter for `Customer` in the `Order` interface. Was forgotten, present in domain model.
+ 2016-01-04: Added sysop `getBlacklistreason(identity)` which returns the reason an `Identity` is blacklisted or `null` if the `Identity` isn't blacklisted.
+ 2016-01-04: Added `Room::getLocalAttributes()`.
+ 2016-01-04: Added `ISearch::searchCustomer()`.
+ 2016-01-05: Added `IClient`.
+ 2016-01-06: Added `ServiceBlueprint.{name, id}, Service.{name, id, blueprint}`.

# Regarding `searchAvailableOrders -> searchAvailableBookings`
> `List<SearchResult<PreOrder>> searchAvailableOrders( SearchQuery<PreOrder> query )`
> changed to `List<SearchResult<PreBooking>> searchAvailableBookings( Date from, Date to, SearchQuery<PreBooking> query )`

Why? The reason is:

1. In order to search for a list of `PreOrder`:s at all, first you must compute the universe/the-initial-data-set.
To do this, you must have a finite interval, otherwise the data set is infinite by definition and thus makes the problem intractable.

2. Computing all possible orders is can be done in many different ways...
First, lets start with computing all possible bookings.
In order to do that, you must first obtain a list of available rooms:

```java
/* Complexity:
 * n = |all bookings|
 * m = |all rooms|
 * O( n^2 + m )
 */
List<Room> rooms = searchAvailableRooms( from, to );
```

Then, you could choose to compute all the `permutations` of all periods in `[from, to]`
with `1` day as the discrete time step.

```java
/* Complexity:
 * d = |days between from and to|
 * O( d^2 )
 */
List<Pair<LocalDate, LocalDate>> periods = new ArrayList<>();
for ( LocalDate f = ldFrom; f.isBefore( ldTo ); f = f.plusDays( 1 ) )
	for ( LocalDate t = f; t.isBefore( ldTo ); t = t.plusDays( 1 ) )
		periods.add( Pair.create( toDate( f ), toDate( t ) ) );

```

Then, to get all the room-bookings, you have to compute the cartesian product
of periods X rooms and creating a PreBooking from ((from, to), room).

```java
/* Complexity:
 * r = |available rooms|
 * rbs = size(available-room-bookings) = r * d^2
 * O(rbs) = O( r * d^2 ) = O( (n^2 + m) * d^2 )
 */
Stream<PreBooking> pbs = concatMap( rooms.stream(),
	room -> listify( periods.map( period -> {
		PreBooking pb = factory.createPreBooking();
		pb.setWillBook( room );
		pb.setStartDate( period.fst() );
		pb.setEndDate( period.snd() );
		return pb;
	} ) ) );
```

The computational complexity is now extreme, and the data set is huge.
All of this can be vastly simplified if you assume that the user wants the entire interval.
The complexity is now `O(r)`.

Now, the most complete way to compute all PreOrders is to compute the
power set of all the available PreBooking:s.

The size of this data set is `2^rbs`.
Assuming that `33` rooms out of `1000` rooms are available, which is reasonable,
then the `size(available-pre-orders) = 2^33`, which is larger than an integer on 32-bit platforms.

We therefore decided that the most reasonable thing to do is to just
let the user pick from the list of available bookings and
perhaps give higher relevance for those rooms that have more beds.
+2016-01-04: Add `createRoomPrototype` sysop
+2016-01-04: Change `createOrder` to take a list of `roomBookings` instead of a `preOrder`
+2016-01-05: Add `IClient` interface and sysop `createCustomer(identiy, paymenmethod, email)`
+2016-01-05: Add `IIdentity` interface and sysop `createIdentity(name, ssn)`
+2016-01-05: Add `createAddress` and move `createGuest` into `IClient`
