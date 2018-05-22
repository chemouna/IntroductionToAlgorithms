
# Chapter 3

## Ex 3.1-1
We need to show that there exists constants c1, c2 , n0 > 0 such that
    0 ≤ c1 (f(n) + g(n)) ≤ max(f(n), g(n)) ≤ c2 (f(n) + g(n)) for all n ≥ n0.

for n≥n0, f(n)+g(n) ≥ max(f(n),g(n)).

Since f(n) ≤ max(f(n), g(n)) and g(n) ≤ max(f(n), g(n))
    => f(n) + g(n) ≤ 2 max(f(n), g(n)) => 1/2 * (f(n) + g(n)) ≤ max(f(n), g(n))

we can combine the above two:

0 ≤ 1/2 * (f(n) + g(n)) ≤ max(f(n), g(n)) ≤ (f(n) + g(n)) for n≥n0
=> max(f(n), g(n)) = θ(f(n) + g(n)) with c1=1/2 and c2=1.

## Ex 3.1-2
We need to show that there exists c1, c2 and n0 > 0 s.t
    0 <= c1 * n^b <= (n + a)^b <= c2 * n^b
    (n + a)^b = n^b + .. + a^b which is >= n^b => c1 = 1 => (n + a)^b = Ω(n^b)

    (n + a)^b = C(b, 0) n^b a^0 + C(n, 1) n^(b - 1) a^1 + C(n, 2) n^(b - 2) a^2 + ... + C(n, n) n^0 a^n >= C0 n^b
    => (n + a)^b = O(n^b)

=> (n+a)^b = θ(n^b)

another way to show it with https://atekihcan.github.io/CLRS/E03.01-02/

## Ex 3.1-3
O(n^2) provides an upper bound; the "at least" negates the upper bound, so it is meaningless.

also There are a ton of different functions that have growth rate less than or equal
to n^2, for ex. functions that are constant or shrink to zero arbitrarily fast. Saying that a function grows more
quickly than a function that shrinks to zero quickly tells us nothing.

## Ex 3.1-4
Is 2^(n+1) = O(2^n) ?
for that to be true => there exists c s.t 2^n <= c * 2^n which is true for c = 2

Is 2^(2n) = O(2^n) ?
for that to be true => there exists c s.t 2^(2n) <= c * 2^n but such c does not exist
because If there a c, such that 0 ≤ 2^n⋅2^n≤ c⋅2n, then c ≥ 2n. But this is not possible for any arbitrarily large
value of n.
so 2^(2n) is not = O(2^n)

## Ex 3.1-5
To prove this theorem, we need to show the logic holds both ways.
If f(n)=Θ(g(n)), then 0≤c1g(n)≤f(n)≤c2g(n) for n≥n0. As 0≤f(n)≤c2g(n) for n≥n0, f(n)=O(g(n)).
And as 0≤c1g(n)≤f(n) for n≥n0, f(n)=Ω(g(n)).

Now we need to prove the other way around.
If f(n)=Ω(g(n)), then 0≤c1g(n)≤f(n) for n≥n1. And if f(n)=O(g(n)), then 0≤f(n)≤c2g(n) for n≥n2.
Combining the above two inequalities, we can say 0≤c1g(n)≤f(n) for n≥max(n1,n2), i.e. f(n)=Θ(g(n)).


