student = [ 'zohan','Nizam', 'nitish', 'manish', 'neeraj', 'Zainab', 'manu', 'Satyam', 'zarina', 'shivam', 'Sanjay']
print("student : ",student)
print('___________________________________________________________________________________________________________')

# sort ny alphabeticaly but it is cansensitive so result come in capital letter then small letter in sorted order 
student.sort()
print("student.sort() : ",student)

# sort in descending order
student.sort(reverse = True)
print("student.sort(reverse = True) : ",student)

# sort in ascending order but show as case-insensitive
student.sort(key = str.lower)
print("student.sort(key = str.lower) : ",student)

# reverse list 
student.reverse()
print("student.reverse() : ",student)
print('___________________________________________________________________________________________________________')

student1 = ['nizam', 101]
print("student1 : ",student1)
student2 = ['manu', 102]
print("student2 : ",student2)
student3 = ['Satyam', 103]
print("student3 : ",student3)
student4 = ['amit', 104]
print("student4 : ",student4)
print('___________________________________________________________________________________________________________')

student5 = student1 + student2
print("student5 = student1 + student2 : ",student5)

for x in student3:
  student5.append(x)
print("for x in student3: \n student5.append(x) : \n",student5)

student5.extend(student4)
print("student5.extend(student4) : ",student5)

