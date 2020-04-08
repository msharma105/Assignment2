number = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
print(number)

def findeven(number):
    even_num = list(filter(lambda x : x % 2 == 0, number))
    print(even_num)
def findodd(number):
    odd_num = list(filter(lambda x : x % 2 != 0, number))
    print(odd_num)
findeven(number)
findodd(number)
