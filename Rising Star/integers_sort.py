number_One = int(input('Enter the first interger'))

number_Two = int(input('Enter the second interger'))

number_Three = int(input('Enter the third interger'))


if number_One > number_Two and number_Two > number_Three:
	print(number_Three, number_Two, number_One)

if number_One > number_Three and number_Three > number_Two:
	print(number_Two, number_Three, number_One)

if number_Two > number_One and number_One > number_Three:
	print(number_Three, number_One, number_Two)

if number_Two > number_Three and number_Two > number_One:
	print(number_Two, number_Three, number_One)

if number_Three > number_One and number_One > number_Two:
	print(number_Two > number_One > number_Three)

if number_Three > number_Two and number_Two > number_One:
	print(number_One, number_Two, number_Three )