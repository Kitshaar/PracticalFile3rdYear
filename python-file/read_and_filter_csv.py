import pandas as pd

def filter_and_save_csv(input_file, output_file, condition):
    """Filter rows based on a condition and save to a new CSV file."""
    try:
        data = pd.read_csv(input_file)
        
        # Convert 'Age' column to numeric (if it contains numbers)
        data['Age'] = pd.to_numeric(data['Age'], errors='coerce')  # Convert and handle errors
        
        filtered_data = data[condition(data)]  # Apply the condition function
        filtered_data.to_csv(output_file, index=False)  # Save to new CSV
        print(f"Filtered data saved to {output_file}")
    except Exception as e:
        print(f"Error: {e}")

# Example usage
input_file = "example.csv"  # Replace with your input file path
output_file = "filtered_example.csv"  # Output file path
condition = lambda df: df['Age'] > 25  # Example condition: Age > 25
filter_and_save_csv(input_file, output_file, condition)
