def factorial(value: int):
    if value < 1:
        return
    if value == 1:
        return 1
    return factorial(value - 1) * value


value: int = int(input("Enter an Integer: "))


print(f"Factorial of {value} is : ", factorial(value))
