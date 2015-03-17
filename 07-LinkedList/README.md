<h1>Linked Lists</h1>
- Linked List: a set of nodes and a way to get to the next node
- Node: contains data and information on how to get to next node
  - Data in each node is localized, so that each node only knows how to get to the next node and has no idea that there are more nodes
- Kind of like a circular list:
  - Alice then Joseph then Michael then David then Mariya then Dillon then Alice then Joseph then Michael then David then Mariya then Dillon then Alice...
  - Like people taking turns in a game

<h2>Assignment</h2>
- Empty list has dummy node
- Keep track of length in instance variable
- add(string) -- still adds to front
- add(index,string)
- Change find(index) to get(index)
- remove(index)
