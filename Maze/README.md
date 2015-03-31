<h2> MAZE PSEUDOCODE </h2>
- BASE CASE: hit a wall or get to the end

- Don't move to the right--recursively call to go to the right
    - Solve(x,y) -- Solve(x+1,y)

- Solve(x,y) {
    - Done if B[x][y] = exit
    - Return to previous step if B[x][y] = wall
    - Otherwise: 
	    - Solve(x+1,y)
        - Solve(x-1,y)
        - Solve(x,y+1)
        - Solve(x,y-1)
}

<H2> TYPES OF SEARCHES </h2>
- Path-finding
- Search
- Blind search: have no info about the maze
- Depth first search: go as deep down one path as you can before going back
- State space search: search where you attempt to get to another state until you reach the end
       - state: state of existence in the world
- Implicit data structure: nodes not created in the program; nodes created/lost so
                         that a graph exists over the course of the program
- Explicit data structure: maze program; maze created by us, explicitly

<h2> FORMATTING </h2>
- System.out.printf()--prints everything on the same line
        - can set placeholder with %s (string), %d (int), %f (float/double)
	- System.out.printf("Hello %s earth", "middle")
		- prints "Hello middle earth"
	- %n_s/d/f 
		- leaves n number of spaces for each string, int, float

<h1> MAZE </h1>
- 2D array of characters
	- $ - exit
	- # - path
	- ' ' - wall
	- C - me
	- . - visited
- Recursively solve in each possible direction
- Depth first search
	- DOWNSIDE: exit may be right in front of you, but you choose the right path
	- UPSIDE: exit may be right in front of you and you choose the right path
- Recursion stack stores how to get back

<h2> Breadth First Search </h2>
	-B
	-C
     - D A E F G
	-H
	-I
	-J K L M
- 1. Enqueue start node [A]  and mark it as visited
- 2. Dequeue start node [A] from the queue
- 3. Enqueue each unvisited neighbor of the current node [D, C, E, H]
