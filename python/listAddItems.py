student1 = ["nizam","nitish","neeraj"]
print(student1)
print()

print("_____________________________________________________________")
print("append items")                                                   # only one item at a time
student1.append("manu")
print(student1)
print()

print("_____________________________________________________________")
print("insert items")                                                   # only one item at a time
student1.insert(2,"manish")
print(student1)
print()

print("_____________________________________________________________")
print("add list to list extends")                                       # only one item at a time
student2 = ["satyam","shivam","sanjay"]
student1.extend(student2)
print(student1)
print()

print("_____________________________________________________________")
print("add list to tuple extends")                                       # only one item at a time
student3tuple = ("zarina","zohan","zainab")
student1.extend(student3tuple)
print(student1)
print()
