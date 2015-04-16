<h1>Priority Queue</h1>
- Each time you check a Node, you check its priority, then add it in order of decreasing priority
- Known as best first search
- When you add each node to the frontier, first assign a priority and then add to the frontier--a priority queue, or ordered list

<H2>Maze Heuristics</h2>
1. Distance formula (euclidean)
2. Manhattan (taxi cab) distance

<h2>A* Search</h2>
- Priority of Node n
  - Cost to get to node N and estimated distance to goal
