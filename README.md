# Chalmers University of Technology, TDA593, 2015-2016, group 5

+ Course page: http://www.cse.chalmers.se/edu/course/TDA593/
+ [Diff/Changelog](difflog.md)
+ [Instructions for interaction testing](interaction-testing.md)

## Running the application:

The build is gradle based.
To run it you need JDK 1.8.

To run the project, do:

```shell
cd application
./run
```

If your terminal does not support colors, instead do:

```shell
cd application
./run -nc
```

To build the project, do:

```shell
cd application
./gradlew build
```

To run unit tests:

```shell
cd application
./gradlew test
```