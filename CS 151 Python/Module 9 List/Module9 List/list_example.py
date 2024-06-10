#meta info

#author: Arash Vasheghani
#date: May 19, 2024
#version: 1
# Is this a part of another program? No

#Pseudocode
# Create a list of at least three different fruits.
# Access and print the first and second elements in the list.
# Modify the second element in the list and print the updated list.
# Add a new fruit to the list and remove an existing fruit, then print the final list.

# Create a list of at least three different fruits.
fruitList = ["apple", "banana", "orange"]

# Access and print the first and second elements in the list.
print(fruitList[0])
print(fruitList[1])

# Modify the second element in the list and print the updated list.
fruitList[1] = "cherry"
print(fruitList)

# Add a new fruit to the list and remove an existing fruit, then print the final list.
fruitList.append("lemon")
fruitList.remove("orange")
print(fruitList)
