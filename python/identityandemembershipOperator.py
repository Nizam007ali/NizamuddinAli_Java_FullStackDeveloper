# identity operator

x = ["hello", "world"]
y = ["hello", "world"]
z = x

# returns True because z is the same object as x
print(x is z)

# returns False because x is not the same object as y, even if they have the same content
print(x is not y)

# to demonstrate the difference betweeen "is" and "==": this comparison returns True because x is equal to y
print(x == y)

# membership operator
print("hello" in x)
print("mango" not in x)