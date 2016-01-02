# Diff Log of things changed in interfaces

> Add as you go...

+ 2015-12-18: Added IFacilities interface to Facilities packages.
+ 2015-12-18: Fixed relationship between Room and RoomAttribute:s.
+ 2015-12-18: Fixed generics in And, Or, Not, MatchesCriteria in that ? extends SRT and ? extends IN was wrong for properties, so it now takes SRT & IN.
+ 2015-12-18: Added return types to methods in IFacilities.
+ 2015-12-26: Fixed generics in SearchQuery, SearchCriteria<? extends SRT> => SearchCriteria<SRT>.
+ 2015-12-29: Fixed generics in SearchCriteria, SearchResult: ? extends SRT => SRT.
+ 2015-12-29: Added Guest:s to RoomBooking - was omitted by mistake prior.
+ 2015-12-29: Added Services to RoomBooking - omitted by mistake prior.
+ 2015-12-29: Added ServiceBlueprints to PreBooking.
+ 2015-12-30: Fixed Client -> Invoice aggregation, now 1:0..*, was a mistake in class diagram.
+ 2015-12-30: Added Invoice.totalPrice, omitted by mistake prior.
+ 2015-12-31: Added blacklist to Hotel interface."

