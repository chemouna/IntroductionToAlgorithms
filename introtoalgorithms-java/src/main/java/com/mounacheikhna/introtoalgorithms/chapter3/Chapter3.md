
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

## Ex 3.1-6
Let’s assume that the running time of the algorithm is T(n). If T(n)=Θ(g(n)), then 0≤c1g(n)≤T(n)≤c2g(n) for n≥n0.
As 0 ≤ T(n) ≤ c2 g(n) for n ≥ n0, T(n) = O(g(n)), i.e. T(n) is upper bounded by O(n). In other words, worst-case
running time of the algorithm is O(n).

And as 0 ≤ c1 g(n) ≤ T(n) for n≥n0, T(n) = Ω(g(n)), i.e. T(n) is lower bounded by Ω(n). In other words, best-case
running time of the algorithm is Ω(n).

## Ex 3.1-7
o(g(n)) ∩ ω(g(n)) is the set of functions f(n) such that 0 ≤ c2g(n) < f(n) < c1g(n). Now, this inequality cannot be
true asymptotically as n becomes very large, f(n) cannot be simultaneously greater than c2 g(n) and less than c1 g(n)
for any constants c1, c2 >0. Hence, no such f(n) exists.

## Ex 3.1-8
Ω(g(n,m)) = { f(n,m) : there exist positive constants c,n0, and m0 such that 0≤cg(n,m)≤f(n,m) for all n≥n0 and m≥m0 }

Θ(g(n,m)) = { f(n,m) : there exist positive constants c1,c2,n0, and m0 such that 0≤c1g(n,m)≤f(n,m)≤c2g(n,m)
    for all n≥n0 and m≥m0

## Ex 3.2-1
- Show that if f(n) and g(n) are monotonically increasing functions, then so are the functions f(n) + g(n) and f(g(n))
f(n) and g(n) are monotonically increasing : if m < n then f(m) < f(n)  and g(m) < g(n)
=> f(m) + g(m) < f(n) + g(n) => f(n) + g(n) is monotonically increasing.

if m < n then g(m) < g(n) and since f is monotonically increasing  => f(g(m)) < f(g(n)) =>  f(g(n)) is  monotonically
increasing.

- if f(n) and g(n) are non negative
since f(n) and g(n) are monotonically increasing : if m < n then f(m) < f(n)  and g(m) < g(n)
then f(m) ⋅ g(m) ≤ f(n)⋅g(n)
=> f(n)⋅g(n) is monotonically increasing.

## Ex 3.2-2
see https://atekihcan.github.io/CLRS/E03.02-02/

## Ex 3.2-3
- using Stirling approximation (see https://ita.skanev.com/03/02/03.html)



