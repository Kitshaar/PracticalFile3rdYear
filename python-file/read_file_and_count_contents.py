def count_file_contents(file_path):
    try:
        with open(file_path, "r") as file:
            lines = file.readlines()

        num_lines = len(lines)  # Count the number of lines
        num_words = sum(
            len(line.split()) for line in lines
        )  # Count the words in each line
        num_chars = sum(
            len(line) for line in lines
        )  # Count the characters in each line

        return num_lines, num_words, num_chars
    except FileNotFoundError:
        print(f"The file '{file_path}' does not exist.")
        return None


# Example usage
file_path = input("Enter the file path: ")
result = count_file_contents(file_path)

if result:
    num_lines, num_words, num_chars = result
    print(f"Number of lines: {num_lines}")
    print(f"Number of words: {num_words}")
    print(f"Number of characters: {num_chars}")
