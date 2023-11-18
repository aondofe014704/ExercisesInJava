pass_word = input("Enter your password : ")

secured_pass_word = len(pass_word) * '*'

print(secured_pass_word) 

age = int(input("Enter Your Age: "))

if age > 18:
	print("Eligible")

print("Not Eligible")

name = input("Enter your name: ")

if name: 
	print("your name is ", name)



