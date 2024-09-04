# Lists are used to store multiple items in a single variable.
subject = ["physics", "chemistry", "mathematics", "hindi", "english"]   # string list
numbers = [1,2,3,4,5,6,7,8,9]                                           # numbers list
listboolean = [True,False,True]                                         # boolean list
myval = ["nizam", 24, True, "90%"]                                      # multi datatype list

print("list show")
print(subject)
print(numbers)
print(listboolean)
print(myval)
print()


print("show type")
print(type(myval))
print()


print("get value by index")
print(numbers[3])                                                       # 0 1 2 3 4 5 6 7 8 {+ve index} 
print(numbers[-3])                                                      # -9 -8 -7 -6 -5 -4 -3 -2 -1 {-ve index}
print(numbers[3:7])                                                     # 3 pos included to 7 pos not included
print(numbers[:5])                                                      # first pos to 5 pos not included
print(numbers[7:])                                                      # 7 pos  included to last pos
print(numbers[-4:-1])                                                   # -4(7) pos included -1(10) pos not included
print()

print("check if list contain value ")
if "nizam" in myval:
    print("nizam is in text")
else:
    print("nizam is not in text")
print()