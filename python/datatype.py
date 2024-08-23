# text
name = "ankit"
print(type(name))                                           # str

# numeric
num1 = 9                                                    # int
num2 = 5.6                                                  # float
num3 = 2 + 6j                                               # complex
print(type(num1))
print(type(num2))
print(type(num3))

# sequence
l1 = list((1,2,3))                                          # list (changeable) order, indexing, duplicates
t1 = tuple((1,2,3))                                         # tuple (unchangeable) order, indexing, duplicates
r1 = range(5)                                               # range
print(type(l1))
print(type(t1))
print(type(r1))

# mapping
d1 = {"name" : "Nizam", "age" : 24}                         # dictionary
print(type(d1))

# set
s1 = {"apple", "banana", "cherry"}                          # set (changeable), unorder, no indexing(so, iterate set to use element), no duplicates
fs1 = frozenset({"apple", "banana", "cherry"})              # frozen set (unchangeable)
print(type(s1))
print(type(fs1))

# boolean
bool1 = True                                                # boolean
print(type(bool1))

# binary
b1 = b"Hi"	                                                # bytes	
ba1 = bytearray(6)	                                        # bytearray	
mv1 = memoryview(bytes(4))	                                # memoryview	
print(type(b1))
print(type(ba1))
print(type(mv1))

# none
n1 = None                                                    # none
print(type(n1))