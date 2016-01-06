[![License]][url: License] [![Semver]][url: Semver]
# [Chalmers University of Technology, TDA593, 2015-2016, group 5]

+ Course page: http://www.cse.chalmers.se/edu/course/TDA593/
+ [Diff/Changelog][difflog.md]
+ [Instructions for interaction testing](interaction-testing.md)

## Building/Running the application:

### Requirements:

The build is gradle based.
To run it you need JDK 1.8.

### Building/Running:

First clone the repository to your local machine:

```shell
git clone https://github.com/Centril/TDA593-MDSD-Group5 && cd TDA593-MDSD-Group5
```

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

## Changelog

See **[difflog.md]**.

## Copyright & License

Licensed under the **[GPL3+ License]**.

Copyright 2016,
+ Hampus Dahlin
+ Mazdak Farrokhzad
+ Joel Gustafsson
+ Ivar Josefsson
+ Mattias Nilsen
+ Erik Norlander
+ Alma Ottedag
+ André Samuelsson

## Bugs | Issues | Feature requests | Contribution

Won't be accepted.

<!-- references -->

[License]: http://img.shields.io/badge/license-GPL_3+-blue.svg?style=flat
[url: License]: LICENSE.md
[Semver]: http://img.shields.io/badge/semver-2.0.0-blue.svg?style=flat
[url: Semver]: http://semver.org/spec/v2.0.0.html

[Chalmers University of Technology, TDA593, 2015-2016, group 5]: https://github.com/Centril/TDA593-MDSD-Group5

[difflog.md]: difflog.md
[GPL3+ License]: LICENSE.md

<!-- references -->