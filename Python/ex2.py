import time
hour = int(time.strftime('%H'))
name=input("Please enter your name : ")
if hour >0 and hour <=11 :
    print ("Good Morning "+name)
elif hour >=12 and hour <=16 :
    print ("Good Afternoon "+name)
else :
    print("Good Evening "+name)


