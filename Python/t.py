import time 
t= time.strftime("%H")
if t == 1 and t < 12 :
    print ("Good morning sir")
elif t ==12 and t < 15 :
    print("Good after noon sir")
else :
    print ("Good evening sir ")
  