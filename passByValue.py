number = 6
print("before", number)

def findeven(number):
    if(number % 2 == 0):
        number='even'  #Assign again
        print("inside",number)
def findodd(number):
    if(number % 2 != 0):
        number='odd'  #Assign again
        print("inside",number)

findeven(number)
print("outside",number)
findodd(number)
