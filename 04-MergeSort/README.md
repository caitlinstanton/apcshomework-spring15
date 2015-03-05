<h2> MERGESORT NOTES </h2>
- There are log2(n) splits for the entirety of the original list
       -(i.e. list is 32, there will be 5 splits)
- Each split loops through the entire list (copies one half to one list and the other half to a second list), giving it a runtime of n
- The sum of each split (merge) -- runtime of n

<h2> Big O notation </h2>
- Function f(n) is said to be O(g(n)), (Order( g(n)), or Big-o g(n)
- Applies if there exists some constant k such that k(g(n)) > f (n) over the long term
- "Tight" upper bound
- EXAMPLE: x^4 + 3x^3 + 2x + 7
       - x^4 has the most power over the function, so it can be defined as: O(x^4)
