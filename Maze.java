/*
BASE CASE: hit a wall
           get to the end

Don't move to the right--recursively call to go to the right
Solve(x,y) -- Solve(x+1,y)

Solve(x,y) {
           Done if B[x][y] = exit
           Return to previous strp if B[x][y] = wall
           Otherwise: Solve(x+1,y)
                      Solve(x-1,y)
                      Solve(x,y+1)
                      Solve(x,y-1)
}
*/
