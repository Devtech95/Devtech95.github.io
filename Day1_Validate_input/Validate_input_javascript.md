## Javascript > Validate input By RegExp

![<img src="https://devtech95.github.io/Day1_Validate_input/Pic/Javascript.gif" width="250"/>](https://devtech95.github.io/Validate_input/Pic/Javascript.gif)

##  ทำไมเราต้องกรองข้อมูลที่รับมาจากผู้ใช้งาน
    เพื่อให้ได้ข้อมูลที่ถูกต้องตามที่เรากำหนด ผู้ใช้งานไม่ควรกรอกข้อมูลแปลกๆ เข้ามาในระบบได้

# บทความนี้จะเป็นวิธีการ Validate input โดยใช้ Function RegExp() ตัวอย่าง Code
![at](https://devtech95.github.io/Day1_Validate_input/Pic/CodeRegExp.PNG)

# ลองทดสอบโดยการใส่ข้อมูลตัวเลขแปลกๆ เช่น  -1
![at](https://devtech95.github.io/Day1_Validate_input/Pic/IncorrectRegExp.PNG)
# จะเห็นข้อความว่า Input not valid 

# ลองทดสอบโดยการใส่ข้อมูลตัวอักษร เช่น theerapong
![at](https://devtech95.github.io/Day1_Validate_input/Pic/IncorrectRegExp2.PNG)
# จะเห็นข้อความว่า Input not valid เช่นเดียวกัน

# ครั้งนี้ลองทดสอบกรอกข้อมูลเลย 13 หลัก
![at](https://devtech95.github.io/Day1_Validate_input/Pic/correctRegExp.PNG)
# จะเห็นข้อความว่า Input OK

## บทความเป็นตัวอย่างการใช้งานอย่างคร่าว ในการกรอกข้อมูลเข้าสู่ระบบ ขอบคุณครับ


Reference::
---------------------------------------
> - https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RegExp
