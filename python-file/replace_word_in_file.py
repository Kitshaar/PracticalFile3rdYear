def find_and_replace(file_path, old_word, new_word):
    try:
        # Read the file content
        with open(file_path, "r") as file:
            content = file.read()

        # Replace the word
        updated_content = content.replace(old_word, new_word)

        # Write the updated content back to the file
        with open(file_path, "w") as file:
            file.write(updated_content)

        print(
            f"Replaced all occurrences of '{old_word}' with '{new_word}' in '{file_path}'."
        )
    except FileNotFoundError:
        print(f"The file '{file_path}' does not exist.")
    except Exception as e:
        print(f"An error occurred: {e}")


# Example usage
file_path = input("Enter the file path: ")
old_word = input("Enter the word to find: ")
new_word = input("Enter the word to replace it with: ")

find_and_replace(file_path, old_word, new_word)
