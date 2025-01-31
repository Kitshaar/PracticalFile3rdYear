def append_to_file(file_path):
    try:
        # Prompt user for input
        user_input = input("Enter the text to append to the file: ")

        # Open the file in append mode and write the input
        with open(file_path, "a") as file:
            file.write(user_input + "\n")

        print(f"Text successfully appended to '{file_path}'.")
    except Exception as e:
        print(f"An error occurred: {e}")


# Example usage
file_path = input("Enter the file path: ")
append_to_file(file_path)
