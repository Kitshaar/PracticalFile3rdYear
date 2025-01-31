import requests

def fetch_json(url):
    """Fetch and parse JSON data from a URL."""
    response = requests.get(url)
    if response.status_code == 200:
        return response.json()  # Convert response to JSON
    else:
        print(f"Error: {response.status_code}")
        return None

# Example usage
url = "http://localhost:8080/api/kanhaiya/users/1"  # Sample API
data = fetch_json(url)

if data:
    print("Fetched JSON Data:", data)
