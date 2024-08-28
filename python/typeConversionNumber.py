x = 5               # int
y = 6.2             # float
z = 3 + 9j          # complex
s = "4"             # string

a = float(x)        #convert from int to float:
b = int(y)          #convert from float to int:
c = complex(x)      #convert from int to complex:
d = complex(y)      #convert from floatt to complex:
e = int(s)          #convert from string to int:
f = float(s)        #convert from string to float:
g = complex(s)      #convert from string to complex:
h = str(x)          #convert from int to string:
i = str(z)          #convert from complex to string:

print(a)
print(b)
print(c)
print(d)
print(e)
print(f)
print(g)
print(h)
print(i)

print(type(a))
print(type(b))
print(type(c))
print(type(d))
print(type(e))
print(type(f))
print(type(g))
print(type(h))
print(type(i))