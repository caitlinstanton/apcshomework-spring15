<h1>Hashing/Hash Tables</h1>
- We want to store things in a table by index (array)
  - Allows for constant time when finding, inserting, removing, etc.
- We have to take a unique ID and convert it into a table index to store it
- Hash function h(x) is a mapping function
  - It takes a piece of information and converts it into an index to our hash table
    - EXAMPLES:
      - h(x) = x % 10,000 [converts OSIS to 4-digit index]
      - h(x) = multiply/add all nonzero digits of x % 10,000
    