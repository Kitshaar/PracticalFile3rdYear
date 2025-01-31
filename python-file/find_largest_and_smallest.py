def find_largest_and_smallest(numbers):
    if not numbers:  # Check if the list is empty
        return None, None

    largest = smallest = numbers[0]  # Initialize with the first element

    for num in numbers:
        if num > largest:
            largest = num
        elif num < smallest:
            smallest = num

    return largest, smallest


# Example usage
numbers = [3, 5, 1, 8, -2, 10, 0]
largest, smallest = find_largest_and_smallest(numbers)

print(f"The largest number is: {largest}")
print(f"The smallest number is: {smallest}")
