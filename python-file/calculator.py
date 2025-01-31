def add(a, b):
    return a + b


def subtract(a, b):
    return a - b


def multiply(a, b):
    return a * b


def divide(a, b):
    if b == 0:
        return "Error: Division by zero is not allowed."
    return a / b


def calculator():
    print("Select operation:")
    print("1. Add")
    print("2. Subtract")
    print("3. Multiply")
    print("4. Divide")

    while True:
        try:
            choice = input("Enter choice (1/2/3/4): ")
            if choice not in {"1", "2", "3", "4"}:
                print("Invalid choice. Please select 1, 2, 3, or 4.")
                continue

            num1 = float(input("Enter the first number: "))
            num2 = float(input("Enter the second number: "))

            if choice == "1":
                print(f"The result of addition is: {add(num1, num2)}")
            elif choice == "2":
                print(f"The result of subtraction is: {subtract(num1, num2)}")
            elif choice == "3":
                print(f"The result of multiplication is: {multiply(num1, num2)}")
            elif choice == "4":
                print(f"The result of division is: {divide(num1, num2)}")

            # Option to exit or continue
            next_calculation = input(
                "Do you want to perform another calculation? (yes/no): "
            ).lower()
            if next_calculation != "yes":
                print("Goodbye!")
                break
        except ValueError:
            print("Invalid input. Please enter numeric values.")


# Run the calculator
calculator()
