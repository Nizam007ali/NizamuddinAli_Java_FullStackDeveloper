# ()	Parentheses	
# **	Exponentiation	
# +x  -x  ~x	Unary plus, unary minus, and bitwise NOT	
# *  /  //  %	Multiplication, division, floor division, and modulus	
# +  -	Addition and subtraction	
# <<  >>	Bitwise left and right shifts	
# &	Bitwise AND	
# ^	Bitwise XOR	
# |	Bitwise OR	
# ==  !=  >  >=  <  <=  is  is not  in  not in 	Comparisons, identity, and membership operators	
# not	Logical NOT	
# and	AND	
# or	OR

x = ((5**2//5+9)&(12*5+7//2-8%3>>1)|(12<<1)+(-5+4*3))
# ((25//5+9)&(60+3-8%1)|(24)+(-5+12))
# ((5+9)&(60+3-0)|(24)+(7))
# ((14)&(63)|(24)+7)
# ((14)|(24)+7)
# (24+7)
# 31
print(x)