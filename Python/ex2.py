import time
hour = int(time.strftime('%H'))
name=input("Please enter your name : ")
gender = input("Please enter your gender male/female/other : ")
if gender=="male" :
 if hour >0 and hour <=11 :
    print ("Good Morning Sir")
 elif hour >=12 and hour <=16 :
    print ("Good Afternoon Sir")
 else :
    print("Good Evening Sir")
elif gender=="female":
 if hour >0 and hour <=11 :
    print ("Good Morning Mam")
 elif hour >=12 and hour <=16 :
    print ("Good Afternoon Mam")
 else :
    print("Good Evening Mam")
else:
 if hour >0 and hour <=11 :
    print ("Good Morning ")
 elif hour >=12 and hour <=16 :
    print ("Good Afternoon ")
 else :
    print("Good Evening ")
   
   


