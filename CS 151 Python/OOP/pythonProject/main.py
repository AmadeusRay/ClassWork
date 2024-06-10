#meta info

#author: Arash Vasheghani
#date: April 28, 2024
#version: 1
# Is this a part of another program? No

#PSEUDOCODE
#add functionality to object / instances

# Parent class
class Animal:
    # Method
    def sound(self):
        print("Animal makes a sound!")

# Subclass inheriting from Animal
class Dog(Animal):
    # Method overriding
    def sound(self):
        print("Dog barks")

# Subclass inheriting from Animal
class Cat(Animal):
    # Method overriding
    def sound(self):
        print("Cat Meows")

# Main program
if __name__ == "__main__":
    # Create an object of the Dog class
    my_dog = Dog()

    # Create an object of the Cat class
    my_cat = Cat()

    # Call the sound method for the dog
    my_dog.sound()

    # Call the sound method for the cat
    my_cat.sound()

#testing class outside of assignment

    neighborCat = Cat()
    neighborDog = Dog()

    neighborCat.sound()
    neighborDog.sound()