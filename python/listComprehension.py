student = ['nizam', 'nitish', 'manish', 'neeraj', 'manu', 'satyam', 'shivam', 'sanjay', 'zarina', 'zohan', 'zainab']
print(student)

student0 = [x for x in student];
print(student0);

student1 = []
for x in student:
  if "z" in x:
    student1.append(x)
print(student1)

student2 = [x for x in student if "m" in x]
print(student2)

student3 = [x for x in student if x != 'manish']
print(student3)

student4 = [U.upper() for U in student]
print(student4)

int1 = [x*10 for x in range(10)]
print(int1)

table5 = [x*5 for x in range(11) if x > 0]
print(table5)