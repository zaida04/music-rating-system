# music-rating-system
This is a mock music navigation and rating system. I made this for my CSE 116 class (despite it not being an assignment yet) as practice.
This uses various concepts of OOP (polymorphism, classes, objects, enums, interfaces).

To break down the flow of the program, we have:

`RatingSystem` - The main system class that holds all the artists, songs, and albums. The responsibility of this class is to be the API interface for querying and mutating data. This class also is responsible for populating its cache from existing data. 

**Concepts:** classes, hashmaps, methods.

`DataLoader/` - This module is responsible for loading the data.json (and other json files) and parsing them as JSON so that they can be consumed by the rating system to populate its initial cache.

**Concepts:** JSON, caching, file reading

`Resources/{Song,Album,Artist}` - These classes represent the building blocks for this program. All songs belong to an album, all albums belongs to an artist. These are all housed in the main `RatingSystem` class.

**Concepts:** polymorphism, classes, abstract classes, constructors, methods

`RateContainer/` - This generic module is responsible for holding ratings for the different resources without duplicating logic. It is also in charge of methods that can generate average ratings artist, album, song ratings, and also bubbling that information up the chain of relation for resources.

**Concepts:** generics, data structures

`UI/` - This module is responsible for the CLI interface that allows a user to interact with the data (querying/mutation).

**Concepts:** overall java concepts

`Util/` - This module contains different utility methods that don't fall under specific classes in other modules.

**Concepts:** extraneous stuff