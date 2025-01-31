# Input string
line = input("Enter a string: ")

# Initialize an empty dictionary
frequency = {}

# Loop through each character in the string
for char in line:
    if char in frequency:
        frequency[char] += 1
    else:
        frequency[char] = 1

# Print the frequency of each character
print("Character Frequency:")
for char, count in frequency.items():
    print(f"{char}: {count}")