student = ['nizam', 'nitish', 'manish', 'neeraj', 'manu', 'satyam', 'shivam', 'sanjay', 'zarina', 'zohan', 'zainab']
print(student)
print()

print("_____________________________________________________________")
print("remove specified items")                                                     # only one item at a time
student.remove("manu")                                                              # if there are more than one value then first occurence only removed
print(student)
# student.remove("manju")                                                           # if there are no value then gives error
# print(student)
print()

print("_____________________________________________________________")
print("pop items")                                                                  # only one item at a time work with index and return value if you want to stor you can
s = student.pop()                                                                   # if not specified index last value removed
print(s)
print(student)
s = student.pop(5)                                                                  # if not specified index last value removed
print(s)
print(student)
print()

print("_____________________________________________________________")
print("delete specified items")                                                     # only one item at a time same as above bu not return value
del student[2]                                                                      # delete 3 value
print(student)
# print("delete list")                                                              # only one item at a time same as above bu not return value
# del student                                                                       # delete 3 value
# print(student)                                                                    # gives error since del will delete list so no list is there
print()

print("_____________________________________________________________")
print("clear all list items")                                                       
student.clear()
print(student)                                                                      # no items in array
print()

print("_____________________________________________________________")
print("delete list")                                                                # only one item at a time same as above bu not return value
del student                                                                         # delete 3 value
# print(student)                                                                      # gives error since del will delete list so no list is there
print()