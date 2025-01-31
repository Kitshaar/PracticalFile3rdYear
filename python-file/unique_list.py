def remove_duplicates(lst):
    return list(set(lst))


# Example usage
numbers = [1, 2, 2, 3, 4, 4, 5, 1, 6]
unique_numbers = remove_duplicates(numbers)

print("Original list:", numbers)
print("List after removing duplicates:", unique_numbers)
