
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
