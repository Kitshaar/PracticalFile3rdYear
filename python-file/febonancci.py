def fibonacci_memoized(n, memo={}):
    if n in memo:
        return memo[n]
    if n <= 0:
        return 0
    elif n == 1:
        return 1

    memo[n] = fibonacci_memoized(n - 1, memo) + fibonacci_memoized(n - 2, memo)
    return memo[n]

n = int(input("Enter the position (n): "))
print(f"The {n}th Fibonacci number (memoized) is: {fibonacci_memoized(n)}")
