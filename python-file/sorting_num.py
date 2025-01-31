def sort_numbers(numbers):
    ascending = sorted(numbers)  # Sort in ascending order
    descending = sorted(numbers, reverse=True)  # Sort in descending order
    return ascending, descending


# Example usage
numbers = [34, 1, 23, 4, 3, 12, 45, 22]
ascending, descending = sort_numbers(numbers)

print("Original list:", numbers)
print("Ascending order:", ascending)
print("Descending order:", descending)
