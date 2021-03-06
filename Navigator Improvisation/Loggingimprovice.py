from os import TMP_MAX, write
import time, platform, getpass
print('Welcome to TestLog')

while True:
    username = input("Enter Username : ")
    password = getpass.getpass("Enter Password : ")
    if username == 'Test' and password == '1234':
        print('Login Success')
        f = open('DB.txt','a')
        f.write('Login Success')
        f.write('Username : ' + username + '\n')
        f.write('Password : ' + password + '\n')
        f.write('OS System : {} = {} \n'.format(platform.system(),platform.version()))
        f.write('Date : {}/{}/{} \n'.format(time.strftime('%d'),time.strftime('%m'),time.strftime('%Y')))
        f.write('Time : {}:{}:{} \n'.format(time.strftime('%H'),time.strftime('%M'),time.strftime('%S')))
        f.write('#'*50 + '\n')
        f.close()
        break
    else:
        print('Login Failed')
        f = open('DB.txt','a')
        f.write('Login Failed')
        f.write('Username : ' + username + '\n')
        f.write('Password : ' + password + '\n')
        f.write('OS System : {} = {} \n'.format(platform.system(),platform.version()))
        f.write('Date : {}/{}/{} \n'.format(time.strftime('%d'),time.strftime('%m'),time.strftime('%Y')))
        f.write('Time : {}:{}:{} \n'.format(time.strftime('%H'),time.strftime('%M'),time.strftime('%S')))
        f.write('#'*50 + '\n')
        f.close()