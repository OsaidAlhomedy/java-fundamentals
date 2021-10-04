# Inheritance and Interfaces

## Feature Tasks

- Create a Shop class; a Shop should have a name, description, and number of dollar signs.

- Implement a constructor for a Shop.

- Implement a reasonable toString method for Shops.

- Add tests for the basics of your Shop class.

- Ensure that your Shop class has an instance method to add a review about that shop, and that it works just as well as the Restaurant instance method with the same purpose.

- Write tests for this functionality.

- The users want theaters! Create a Theater class; a Theater should have a name and all of the movies currently showing there. (Strings are fine for the movies; no need to create another class.)

- Implement a constructor for a Theater.

- Write addMovie and removeMovie instance methods that allow the theater to update which movies are being shown.

- Implement a reasonable toString method for Theaters.

- Test your Theater functionality.

- Users are frustrated: they like having a body, an author, and a number of stars, but when they’re reviewing a Theater, they also want to specify which movie they saw.

- Add testing for any new functionality you’ve created.

## Testing

I used unit testing for this library with the help of Junit 5 which made it easy.

To run the test just type `$ ./gradlew test` in the root directory.
