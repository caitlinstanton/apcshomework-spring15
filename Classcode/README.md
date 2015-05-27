<h1>Notes</h1>

<h2>Getting the shortest path</h2>
1. Add new node n (with lowest cost) to solution set
2. For each node not in such set, cost is equal to:
  - min(current cost, cost from start to n + cost from n to the node)
