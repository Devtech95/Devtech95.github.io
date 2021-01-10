## Javascript > EncodeURIComponent

<img align="center" width="400" height="200" src="https://devtech95.github.io/Day2_EncodeURIComponent/Pic/Javascript.gif">

## Syntax
> - encodeURIComponent(str);
## Parameters
> - String. A component of a URI.

<img align="center" width="400" height="200" src="https://devtech95.github.io/Day2_EncodeURIComponent/Pic/Simple.PNG">

# encodeURIComponent คือ คำสั่งในการเข้ารหัส URL Parameter โดยตัวคำสั่งนี้จะมีการแทนที่ด้วยอักขระพิเศษต่าง ๆ เช่น , / ? : @ & = + $ # ซึ่งมีประโยชน์อย่างมากเวลาทำการส่งข้อมูลแบบ GET ที่ข้อมูลอยู่ในรูปแบบของภาษาไทย ซึ่งคำสั่งนี้จะช่วยเข้ารหัส (encodes) เพื่อป้องกันความผิดพลาดในการส่ง และรับข้อมูล


# บทความนี้จะเป็นวิธีการใช้งาน EncodeURIComponent  ตัวอย่าง Code
![at](https://devtech95.github.io/Day2_EncodeURIComponent/Pic/Simplecode.PNG)


# ลองทดสอบโดยการใส่ข้อมูล URL Website http://www.devtech95.github.io/index.php?data=a&data_2=b
![at](https://devtech95.github.io/Day2_EncodeURIComponent/Pic/test1.PNG)

# Return value:
> - http%3A%2F%2Fwww.devtech95.github.io%2Findex.php%3Fdata%3Da%26data_2%3Db

![at](https://devtech95.github.io/Day2_EncodeURIComponent/Pic/Returnvalue.PNG)


## บทความเป็นตัวอย่างการใช้งาน Function EncodeURIComponent() อย่างคร่าว  ขอบคุณครับ


Reference::
---------------------------------------
> - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/encodeURIComponent
