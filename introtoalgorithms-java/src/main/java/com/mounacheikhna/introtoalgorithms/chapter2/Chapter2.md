
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



