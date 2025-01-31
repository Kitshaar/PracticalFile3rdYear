class CustomError(Exception):
    """Custom exception for demonstration."""

    pass


def risky_operation(value):
    try:
        if value < 0:
            raise CustomError("Negative value not allowed")
        result = 10 / value  # May raise ZeroDivisionError
    except CustomError as e:
        print(f"CustomError: {e}")
    except ZeroDivisionError:
        print("Error: Division by zero!")
    else:
        print(f"Success! Result: {result}")
    finally:
        print("Execution completed.")


# Test cases
risky_operation(2)  # Successful execution
risky_operation(0)  # ZeroDivisionError
risky_operation(-1)  # CustomError
