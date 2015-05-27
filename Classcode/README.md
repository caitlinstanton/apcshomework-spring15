<h1>Notes</h1>

<h2>Getting the shortest path</h2>
<h3>Dijkstra's Algorithm</h3>
- Type of priority queue that uses another function (method to reduce key)
  - It's an array-based heap
1. Add new node n (with lowest cost) to solution set
2. For each node not in such set, cost is equal to:
  - min(current cost, cost from start to n + cost from n to the node)
