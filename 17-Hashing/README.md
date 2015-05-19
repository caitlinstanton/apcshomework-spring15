<h1>Hashing/Hash Tables</h1>

- We want to store things in a table by index (array)
  - Allows for constant time when finding, inserting, removing, etc.
- We have to take a unique ID and convert it into a table index to store it
- Hash function h(x) is a mapping function
  - It takes a piece of information and converts it into an index to our hash table
    - EXAMPLES:
      - h(x) = x % 10,000 [converts OSIS to 4-digit index]
      - h(x) = multiply/add all nonzero digits of x % 10,000
- PROBLEM: multiple objects can hash to the same slot/index [called clash, collision]
  - Hash table's array has to be sufficiently large (sparsely populated)
  - Hash function should do a good job distributing items in the table
- int hash(String s) {
  - h = 1;
  - for (i = 0 to s.length) {
    - h = h * 11 + int(s.charAt(i));
  - }
  - return h % table.size();
- }

<h2>Closed Hashing</h2>
- Everything is stored in the array
- If collisions occur, use any of the following methods:
  - Rehashing
  - Linear probing
  - Leave space in the table using amultiplier
- insert(), retrieval() --> O(1)

<h2>Open Hashing</h2>
- Each array element is a pointer to a linked list of values that hash that element
- insert() --> O(1)
- retrieval() --> [expected] O(1)
  - O(n) with respect to the length (n) of teh linked list at the current location
