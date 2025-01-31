import random
import string

def generate_password(length=12):
    """Generate a random password of given length."""
    characters = string.ascii_letters + string.digits + string.punctuation
    return ''.join(random.choice(characters) for _ in range(length))

# Example usage
password = generate_password(16)  # Generates a 16-character password
print(f"Generated Password: {password}")
