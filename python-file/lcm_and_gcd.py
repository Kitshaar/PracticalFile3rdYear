import math

def gcd_lcm(a, b):
    """Return the GCD and LCM of two numbers."""
    gcd = math.gcd(a, b)
    lcm = (a * b) // gcd  # Using the formula: LCM(a, b) = (a × b) / GCD(a, b)
    return gcd, lcm

# Example usage
a, b = map(int, input("Enter two numbers: ").split())
gcd, lcm = gcd_lcm(a, b)
print(f"GCD of {a} and {b} is {gcd}")
print(f"LCM of {a} and {b} is {lcm}")
