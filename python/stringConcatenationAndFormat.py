a = "Nizam"
b = "Ali"
c = a + " " + b
print(c)

age = 24
#txt = "I am " + age
#print(txt)                               this will give string format error
txt = f"My name is {a} {b}, I am {age} years old"    # f-string is used and add curly brackets forplaceholders for variables and other operations.
print(txt)
price = 99
txt = f"The price of mango is {price:.2f} rupees"
print(txt)
txt = f"So, The price of 20 mango is {price*20:.2f} rupees"
print(txt)