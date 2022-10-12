## Satellite starter
This is the start point for exercise 3 of the Hibernate course.
It builds upon the solution to exercise 1.

Included dependencies are Spring Data JPA, Spring Web and the H2 Database driver.

### The exercise

Your goal is to implement a repository with several queries using Spring Data.

- Find a Galaxy by a name (exactly)
- Find a Galaxy by a name (fuzzy)
- Retrieve all Stars for a given Galaxy
- Find all Planets and Planetoids by a name (fuzzy) that orbit a Star of a given type
- Find all SpaceObjects orbiting a Star, up to 3 levels deep (spaceObjects of spaceObjects)
