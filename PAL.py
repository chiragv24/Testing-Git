def userInfo():
    details = []
    age = input("Age")
    name = input("Name")
    course = input("Course")
    hometown = input("Hometown")
    file = open("PAL.txt","w")
    file.write(age)
    file.write(name)
    file.write(course)
    file.write(hometown)
    file.close()
userInfo()

##kobe bryant 24


##try:
##        file = open("PAL.txt","w")
##        file.write(details)
####    except IOError as err:
####        print("Error writing to the file ",err)
####    finally:
####        if "PAL.txt" in locals():
##        file.close()
