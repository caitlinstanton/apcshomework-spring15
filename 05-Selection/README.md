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
