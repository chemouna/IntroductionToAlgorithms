
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

## Problem 2.1
a. For input of size k, insertion sort runs on Θ(k^2) worst-case time but specifically O(a k^2 + bk + c) so for n/k
sublists its n/k . O(a k^2 + bk + c) so othe dominant term is O(nk).

b. We have n elements divided into n/k sorted sublists each of length k. To merge these n/k sorted sublists to get a
single sorted list of length n, we have to take 2 sublists at a time and continue to merge them, so that is log(n/k)
steps, and in every step, we are comparing n elements, so the overall running time is Θ(n lg(n/k)).

c. For the modified algorithm to have the  running time Θ(nk + nlg(n/k)) = Θ(nk + nlgn − nlgk) must be same as Θ(nlgn).
   To satisfy this, k cannot grow faster than lg n.
   so let's take k = O(lg n)
   O(nk + n lg n - n lg k) = O(nlg n + n lg n - n lg lg n) = O(2n lg n - n lg lg n) ~ O(n lg n)

d. in practice because of the constant factors its better to run tests and determine the best k to choose from the
results (i.e find out at which k insertion sort starts beating merge sort in speed).

## Problem 2.2
a. We need to prove that A' contains all the elements originally in A which is true since all we do is swapping the
elements.

b & c. (see https://bradyt.com/clrs/ch2_p/)

d. O(n^2) , the same as insertion sort , however, bubble sort also has best-case running time Θ(n^2) whereas insertion
sort has best-case running time Θ(n)

## Problem 2.3
a. O(n)
b.
 y = 0
 for i=0 to n do
   yi = x
   for j=1 to n do
     yi = yi * x
   end for
   y = y + ai * yi
 end for

 running time for it is O(n^2) so its slower than Horner's rule

c. see http://cs.txstate.edu/~ch04/webtest/teaching/courses/5329/lectures/horner.pdf

d. the invariants proved in c/ showed that the algorithms computs the sum corresponding to the value of the polynomial
computed at x






















