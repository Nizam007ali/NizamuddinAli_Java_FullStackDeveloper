# python has no command for declaring variable, automatically declare at time of assigning value               
s1 = "nizam"                # string
s2 = 'ali'                  # both are same "" or ''
age = 24                    # integer
print(s1,s2,"age is",age)

# type casting  //if you want to give datatype of a variable
a = int(5)
print(a)
A = str(5)                  # python is case-senitive, a and A is different
print(A)
b = float(5)
print(b)

# type() for data type
print(type(a))
print(type(A))

# variable names
# A variable name must start with a letter or the underscore character (name, _name)
# A variable name cannot start with a number *(1name)
# A variable name can only contain alpha-numeric characters and underscores (A-z, 0-9, and _ ) (Name_1)
# Variable names are case-sensitive (age, Age and AGE are three different variables)
# A variable name cannot be any of the Python keywords. *(if, while)

# case:-
# camel case (studentName)
# pascal case (StudentName)
# underscore case (student_name)