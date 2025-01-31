class Library:
    def __init__(self, name):
        """
        Initialize the library with a name and an empty collection of books.
        """
        self.name = name
        self.books = {}
        self.issued_books = {}

    def add_book(self, book_name, quantity=1):
        """
        Add a book to the library collection.
        :param book_name: Name of the book to add.
        :param quantity: Number of copies to add.
        """
        self.books[book_name] = self.books.get(book_name, 0) + quantity
        print(f"Added {quantity} copies of '{book_name}' to the library.")

    def issue_book(self, book_name, borrower):
        """
        Issue a book to a borrower.
        :param book_name: Name of the book to issue.
        :param borrower: Name of the borrower.
        """
        if book_name not in self.books or self.books[book_name] == 0:
            print(f"Sorry, '{book_name}' is not available in the library.")
        elif (
            book_name in self.issued_books and borrower in self.issued_books[book_name]
        ):
            print(f"'{book_name}' is already issued to {borrower}.")
        else:
            self.books[book_name] -= 1
            self.issued_books.setdefault(book_name, []).append(borrower)
            print(f"Issued '{book_name}' to {borrower}.")

    def return_book(self, book_name, borrower):
        """
        Return a book to the library.
        :param book_name: Name of the book to return.
        :param borrower: Name of the borrower.
        """
        if book_name in self.issued_books and borrower in self.issued_books[book_name]:
            self.issued_books[book_name].remove(borrower)
            self.books[book_name] = self.books.get(book_name, 0) + 1
            print(f"'{book_name}' has been returned by {borrower}.")
            if not self.issued_books[book_name]:
                del self.issued_books[book_name]
        else:
            print(f"'{book_name}' was not issued to {borrower}.")


# Example usage
library = Library("City Library")

library.add_book("Python Programming", 3)
library.add_book("Data Structures", 2)


library.issue_book("Python Programming", "Alice")
library.issue_book("Data Structures", "Bob")
library.issue_book("Python Programming", "Charlie")


library.return_book("Python Programming", "Alice")
