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
- Parameters: list L, int k (kth element), upper and lower bounds of section of list we're looking for
	- FIRST RUNTHROUGH:
		- Lower bound = 0
		- Upper bound = length - 1
<h3> Steps to find kth smallest element </h3>
1. Choose a pivot value (random number--in our case 9, but it can be any value)
	- List L: [8, 3, 9, 6, 4, 12, 13, 21, 2, 14]
2. Swap pivot value with the value at the upper bound
3. Adjust variables
	- LowerBound = low
	- HigherBound = HigherBound - 1
4. while(LowerBound < HigherBound)
	- If L[LowerBound] < pivot
		- LowerBound++
		- else {swap L[LowerBound] and L[HigherBound]
		- HigherBound--
	- REPEAT
5. Swap pivot with first right side element
6. If the pivot is at index k, then you're done
	- else
		- select(A,k,L,pivot-1) or select(A,k,pivot+1,H)
			- depends on where pivot is in relation to k

- If we're looking for the kth element, you know vaguely where it is in relation to the pivot number. Either you're done is the pivot value is the smallest, or call select on the appropriate section of the rearranged list
	- Looking for the 3rd smallest element--find the element of index 3 in the list before 9
	- Sort elements around that number (in our case, 4)
	
