x = 5                           # global variable

def fun1():
    x = 8                       # local variable
    print(x)                    # print local variable, no change in global variable
    
fun1()
print(x)                        # print global variable

def fun2():
    global x                    # accessing global variable
    x = 10                      # change global variable value
    
fun2()
print(x)                        # print global variable(change)