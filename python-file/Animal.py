# Base class
class Animal:
    def __init__(self, name):
        self.name = name

    def sound(self):
        return "Some generic animal sound"

    def describe(self):
        print(
            f"This is an animal named {self.name}. It makes a sound like: {self.sound()}"
        )


# Derived class
class Dog(Animal):
    def sound(self):
        return "Bark"

    def describe(self):
        print(f"This is a dog named {self.name}. It says: {self.sound()}")


# Another derived class
class Cat(Animal):
    def sound(self):
        return "Meow"

    # Not overriding the describe method


# Demonstration
def main():
    # Create objects of each class
    generic_animal = Animal("Generic")
    dog = Dog("Buddy")
    cat = Cat("Whiskers")

    # Call methods
    print("\nCalling describe() for each object:")
    generic_animal.describe()
    dog.describe()
    cat.describe()  # Uses base class `describe`

    print("\nCalling sound() for each object directly:")
    print(f"Animal sound: {generic_animal.sound()}")
    print(f"Dog sound: {dog.sound()}")
    print(f"Cat sound: {cat.sound()}")


if __name__ == "__main__":
    main()
