def merge_dictionaries(dict1, dict2):
    merged_dict = dict1.copy()  # Create a copy of the first dictionary
    merged_dict.update(dict2)  # Add the second dictionary
    return merged_dict


# Example usage
dict1 = {"a": 1, "b": 2, "c": 3}
dict2 = {"d": 4, "e": 5, "b": 6}

merged_dict = merge_dictionaries(dict1, dict2)

print("Dictionary 1:", dict1)
print("Dictionary 2:", dict2)
print("Merged Dictionary:", merged_dict)
