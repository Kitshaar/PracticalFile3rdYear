import pandas as pd

def display_csv_contents(file_path):
    """Read and display contents of a CSV file."""
    try:
        data = pd.read_csv(file_path)
        print(data)
    except Exception as e:
        print(f"Error reading the file: {e}")

# Example usage
file_path = "example.csv"  # Replace with your file path
display_csv_contents(file_path)
