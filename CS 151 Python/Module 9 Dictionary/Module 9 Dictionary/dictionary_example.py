#meta info

# author: Arash Vasheghani
# date: May 19, 2024
# version: 1
# Is this a part of another program? No

# Create a dictionary representing a student with keys: name, age, and courses
# (which is a list of courses the student is taking).
# Access and print the value associated with the "name" key.
# Modify the student's age and add a new course to the list of courses, then print the updated dictionary.
# Print all keys, values, and items in the dictionary.

def printStudents(students):  # a cleaner print without the brackets
    print(f"Name: {students['name']}")
    print(f"Age: {students['age']}")
    print(f"Courses: {', '.join(students['courses'])}")


# Create a dictionary representing a student with keys: name, age, and courses
students = {  # if more students are added. student1, student2, student 3, etc.
    "student1": {
        "name": "Peggy Sue",
        "age": "22",  # I made age a string. I can't imagine math is needed
        "courses": ["Physics 1", "Intro to Computer Science", "US History Post-1886"]
    }
}

# Access and print the value associated with the "name" key.
print(students["student1"]["name"])

# Modify the student's age and add a new course to the list of courses...
students["student1"]["age"] = "23"
students["student1"]["courses"].append("Linear Algebra")

# ...then print the updated dictionary.
print(students["student1"]["age"])
print(students["student1"]["courses"], "\n")

# Print all keys, values, and items in the dictionary.
student1 = students["student1"]  # for input of the function / definition I created for a clean print
printStudents(student1)
# if it was a real program, "student1" would be a user input
# and the system would have their name or ID number (probably ID number) as the input.
