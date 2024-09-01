str1 = 'hello'
str2 = "hello"          #both contain same string
print(str1==str2)

# we can use quotes but make sure it doesn't match the quotes surrounding the string
print("Hello! It's Nizam")
print("He is called 'Haider'")
print('He is called "Nitish"')

#escape characters
print('It\'s ok')                               # \'	Single Quote	
print('6\\2 = ',(6/2))                          # \\	Backslash	
print('My name is nizam \n Welcome back!')      # \n	New Line	
print('My name is nizam \r Welcome back!')      # \r	Carriage Return	
print('My name is nizam, \t Welcome back!')     # \t	Tab	
print('My name is nizam, \bWelcome back!')      # \b	Backspace
print("\110\145\154\154\157")                   # \ooo	Octal value	
print("\x48\x65\x6c\x6c\x6f")                   # \xhh	Hex value

#Multiline string
str = '''   Johny, Johny
    (Yes, papa)
    Eating sugar?
    (No, papa)
    Telling lies?
    (No, papa)
    Open your mouth
    (Ah, ah, ah)'''
print(str)