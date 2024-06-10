

# Meta info

#Arash Vasheghani
#CS/IS 151 - 1120
#April 2 2024
#Quiz Module 6

# Use open function with "write" mode and specify the file name as "test001.txt".

infile = open("test001.txt", 'w')

# Write three lines of information about GHS:

infile.write((f"About Glendale Highschool, its address is 1440 E Broadway, Glendale, CA 91205\n"))

# Line #2: Year of Establishment

infile.write((f"Built in 1901\n"))

# Line #3: Name of Mascot

infile.write((f"Its two mascots are the Dynamiters for the American football program and the Nitros for all other sports\n"))

# Don't forget to close the file once the file operation is complete.
infile.close()

quit()

if __name__ == "__main__":
    main()
