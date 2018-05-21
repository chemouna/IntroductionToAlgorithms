
# Chapter 3

## Ex 3.1-1
We need to show that there exists constants c1, c2 , n0 > 0 such that
    0 ≤ c1(f(n)+g(n)) ≤ max(f(n), g(n)) ≤ c2(f(n)+g(n)) for all n ≥ n0.

for n≥n0, f(n)+g(n) ≥ max(f(n),g(n)).

Since f(n) ≤ max(f(n), g(n)) and g(n) ≤ max(f(n), g(n))
    => f(n) + g(n) ≤ 2 max(f(n), g(n)) => 1/2 * (f(n) + g(n)) ≤ max(f(n), g(n))

we can combine the above two:

0 ≤ 1/2 * (f(n) + g(n)) ≤ max(f(n), g(n)) ≤ (f(n) + g(n)) for n≥n0
=> max(f(n), g(n)) = θ(f(n) + g(n)) with c1=1/2 and c2=1.

