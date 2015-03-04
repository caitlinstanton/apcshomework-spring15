<h2> MAZE PSEUDOCODE </h2>
- BASE CASE: hit a wall or get to the end

- Don't move to the right--recursively call to go to the right
    -Solve(x,y) -- Solve(x+1,y)

- Solve(x,y) {
           - Done if B[x][y] = exit
           - Return to previous step if B[x][y] = wall
           - Otherwise: Solve(x+1,y)
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
                     --can set placeholder with %s (string), %d (int), %f (float/double)
		   - System.out.printf("Hello %s earth", "middle");
		        --prints "Hello middle earth"
		   --%n_s/d/f -- leaves n number of spaces for each string, int, float


