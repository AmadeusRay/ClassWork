#meta info

# author: Arash Vasheghani
# date: May 19, 2024
# version: 1
# Is this a part of another program? No

#Pseudocode
# Create a tuple with three different colors.
# Access and print the first and last elements in the tuple.
# Unpack the tuple into three variables and print each variable.
# Concatenate the tuple with another tuple containing three numbers and print the resulting tuple.

# Create a tuple with three different colors.
colors = ("red", "green", "blue")

# Access and print the first and last elements in the tuple.
print(colors[0])
print(colors[2])

# Unpack the tuple into three variables and print each variable.
#Red = colors[0]
#Green = colors[2]
#Blue = colors[1]
#or
Red, Green, Blue = colors
print(Red)
print(Green)
print(Blue)

# Concatenate the tuple with another tuple containing three numbers and print the resulting tuple.
numbers = (1, 2, 3)
colorsNumbered = colors + numbers
print(colorsNumbered)


