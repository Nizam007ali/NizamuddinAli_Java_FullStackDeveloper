student = ['nizam', 'nitish', 'manish']
print(student)

# print all items in list using simple for
for s in student:
    print(s)

# print all items in list using index
for i in range(len(student)):
    print(student[i])

# print all items in list using while
while i < len(student):
    print(student[i])
    i = i + 1

# print all items in list using list comprehesion
[print(x) for x in student]