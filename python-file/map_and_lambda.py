# Using lambda and map() to square each number in a list
numbers = [1, 2, 3, 4, 5]
squared_numbers = list(map(lambda x: x ** 2, numbers))

print(f"Original list: {numbers}")
print(f"Squared list: {squared_numbers}")
