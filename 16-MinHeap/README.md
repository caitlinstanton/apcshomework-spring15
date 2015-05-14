<h1>Min Heap</h1>

<h2>Characteristics</h2>
- Each child is greater than its parent
- Each level is as full as possible from left to right
- Given node n, its children are 2n and 2n+1
    - Vice versa, given node n, its parent is n/2
- Can be contained in an array (with empty slots for each node not there)

<h2>Runtimes</h2>
- findMin --> O(1)
- removeMin, pushDown, insert --> O(log n)
- heapSort --> O(n * log n)
- Convert normal array/tree to heap --> O(n)
