
# Chapter 2

## Ex 2.1-4

carry = 0
for i = 1 to A.length
    int v = (A[i] + B[i] + carry)
    C[i] = v (mod 2)
    if (v >= 2)
        carry = 1
    else
        carry = 0
C[n+1] = carry

## 2.2-1
O(n^3)

## 2.2-2

// selection sort
n = A.length
for i = 1 to n-1
    smallestPosition = i
    for j = i + 1 to n
        if (A[smallestPosition] > A[j])
            smallestPosition = j
    temp = A[i]
    A[i] = A[smallestPosition]
    A[smallestPosition] = temp

Invariant of the first loop: A[1..i - 1] contains the smallest elements of A in increasing order
    Initialization: for i = 1 , A[1..1] is sorted (trivial)
    Maintenance: after an iteration with the swap done at the end we add the next smallest element in the position i
        so we maintain the increasing order property and we maintain that it still contains only the smallest elements
    Termination: After n − 1 iterations of the loop, the n − 1
                 smallest elements of A are in the first n − 1 positions of A in increasing order,
                 so the nth element is necessarily the largest element.


- Why does it need to run for only the first n - 1 elements, rather than for all n elements?
because after picking the n-1 smallest elements the only element left is the largest one.

- the best-case and worst-case running times of selection sort
the best case and the worst case are O(n^2)

## 2.2-3
- On average, half the the elements in array A will be checked before v is found in it. And in the worst case
(v is not present in A), all the elements needs to be checked.
So, the running time in both cases is Θ(n).

## 2.2-4
modify it to handle the best-case efficiently. For example, if we modify merge-sort to check if the array is sorted
and just return it, the best-case running time will be Θ(n).

## Ex 2.3-4
the recurrence if T(n) = O(1) if n = 1 and T(n) = T(n - 1) + O(n) if n > 1
and the solution to that recurrence is O(n^2)

## Ex 2.3-5
We will keep dividing the array size each time by 2 until either the element is found or we get to an array of size one
and the element is not found which is the worst case and that will the number of times to divide n by 2 until we get to
one , which is log n. (the running time T(n)= T((n−1)/2) + Θ(1) = Θ(lgn) )

## Ex 2.3-6
Insertion sort does two things:
- A linear search to scan (backward) through the sorted sub-array to find the proper position for key.
- Shift the elements greater than key towards the end to insert key in the proper position.
Although we can reduce the number of comparisons by using binary search to accomplish 1/, we still need to shift
all the elements greater than key towards the end of the array to insert key. And this shifting of elements runs
at Θ(n) time. So, the overall worst-case running time of insertion sort will still be Θ(n^2).

## Ex 2.3-7
first sort the array then iterate through it and for each element val do a binary search for x - val to find it
and the running time will be O(n log n) for sorting and O(n log n) for binary search for each element so total
running time is O(n log n)

(See https://atekihcan.github.io/CLRS/E02.03-07/)
