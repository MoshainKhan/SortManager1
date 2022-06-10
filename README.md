# SortManager1
#This is a Sort manager which can Sort out arrays using three alogrithmn which are as follows:
#Bubblesort: sort is one of the first sorting algorithms you should master. While it isn't particularly efficient, it's simple and intuitive. Bubble Sort compares neighboring elements and forces larger elements to 'bubble' to the end of an array while simultaneously 'floating' smaller elements to the top/front of a list. This sorting algorithm is what you might do if you were asked to sort a list one by one.
#MergetSort:  Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then it merges the two sorted halves. The merge() function is used for merging two halves. The merge(arr, l, m, r) is a key process that assumes that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one. 
#SelectionSort: The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

The subarray which is already sorted. 
Remaining subarray which is unsorted.
In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray. 
#Binary Tree Sort: A tree sort is a sort algorithm that builds a binary search tree from the elements to be sorted, and then traverses the tree (in-order) so that the elements come out in sorted order.[1] Its typical use is sorting elements online: after each insertion, the set of elements seen so far is available in sorted order.

Tree sort can be used as a one-time sort, but it is equivalent to quicksort as both recursively partition the elements based on a pivot, and since quicksort is in-place and has lower overhead, it has few advantages over quicksort. It has better worst case complexity when a self-balancing tree is used, but even more overhead.
