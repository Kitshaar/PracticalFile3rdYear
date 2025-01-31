def demonstrate_args(*args):
    print("Positional arguments (*args):")
    for arg in args:
        print(arg)


def demonstrate_kwargs(**kwargs):
    print("\nKeyword arguments (**kwargs):")
    for key, value in kwargs.items():
        print(f"{key}: {value}")


# Example usage
print("Demonstrating *args:")
demonstrate_args(1, 2, 3, "hello", True)

print("\nDemonstrating **kwargs:")
demonstrate_kwargs(name="Alice", age=30, city="New York")
