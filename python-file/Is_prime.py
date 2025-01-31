def is_prime(n):
    """Check if a number is prime."""
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def find_primes(start, end):
    """Find all prime numbers in the given range."""
    return [num for num in range(start, end + 1) if is_prime(num)]

# Example usage
start, end = 10, 50
print(f"Prime numbers between {start} and {end}: {find_primes(start, end)}")
