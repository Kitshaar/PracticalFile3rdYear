class BankAccount:
    def __init__(self, account_holder, balance=0):
        """
        Initialize a new BankAccount object.

        :param account_holder: Name of the account holder.
        :param balance: Initial balance (default is 0).
        """
        self.account_holder = account_holder
        self.balance = balance

    def deposit(self, amount):
        """
        Deposit money into the account.

        :param amount: Amount to deposit.
        """
        if amount <= 0:
            print("Deposit amount must be positive.")
            return

        self.balance += amount
        print(f"Deposited {amount:.2f}. New balance: {self.balance:.2f}")

    def withdraw(self, amount):
        """
        Withdraw money from the account.

        :param amount: Amount to withdraw.
        """
        if amount <= 0:
            print("Withdrawal amount must be positive.")
            return

        if amount > self.balance:
            print("Insufficient balance.")
            return

        self.balance -= amount
        print(f"Withdrew {amount:.2f}. New balance: {self.balance:.2f}")

    def display_balance(self):
        """Display the current account balance."""
        print(f"Account holder: {self.account_holder}")
        print(f"Current balance: {self.balance:.2f}")


# Example usage
account = BankAccount("Alice", 1000)
account.display_balance()

account.deposit(500)
account.withdraw(300)
account.withdraw(1500)
account.display_balance()
