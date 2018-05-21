
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

