# Sample list of tuples
data = [(1, 5), (3, 2), (4, 8), (2, 1)]

# Sorting using lambda function (sorts by the second element)
sorted_data = sorted(data, key=lambda x: x[1])

print(f"Sorted list: {sorted_data}")
