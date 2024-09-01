# logical operator (boolean)
        # x       y           x and y         x or y          not x
        # True    True        True            True            False
        # True    False       False           True            -
        # False   True        False           True            True
        # False   False       False           False           -

x , y = 5 , 9

print(x > 4 and y < 7)              # true and false : false
print(x > 4 or y < 7)               # true or false : true
print(not(x > 4 and y < 10))        # not(true and true) : not(true) : false

# bitwise operator (number is change to bit)
            # x         y               x & y           x | y           x ^ y           ~x
            # 0         0               0               0               0               1
            # 0         1               0               1               1               -
            # 1         0               0               1               1               0
            # 1         1               1               1               0               -

x = 11      # 00001011
y = 19      # 00010011
z = -20
print(x&y)  # 00000011
print(x|y)  # 00011011
print(x^y)  # 00011000
print(~x)   
print(~z)   
print(x<<2) # 00101100
print(y>>2) # 00000100