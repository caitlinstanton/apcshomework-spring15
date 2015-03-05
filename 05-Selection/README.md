<h2> O(n^2) </h2>
- findk (List L, int k) {
	- copy < temp
	- while (k > 1) {
		- delete smallest from top
	- }
	- return min [top value]
- }


<h2> O(nlog(n)) </h2>
- tmp = msort(L);
- return tmp[k]

<h2>Selection</h2>
- In sorted list, the kth smallest element is at L[k]
1. Choose a pivot value (random number--in our case 9, but it can be any value)
	- List L: [8, 3, 9, 6, 4, 12, 13, 21, 2, 14]
2. Partition the list by rearranging it around the pivot value
	- Sort list around 9 (i.e. is 8 smaller than 9? Move it to the left of 9)
	- End up with [8, 3, 6, 4, 2, 9, 12, 13, 21, 14]
	- 9 is the 5th element in the list
3. If we're looking for the kth element, you know vaguely where it is in relation to the pivot number. Either you're done is the pivot value is the smallest, or call select on the appropriate section of the rearranged list
	- Looking for the 3rd smallest element--find the element of index 3 in the list before 9
	- Sort elements around that number (in our case, 4)
