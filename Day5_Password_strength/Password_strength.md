# Java > Password Strength By java

## How to validate a Password using Regular Expressions in Java

     การตั้งรหัสผ่านในประจุบัน ยังมีการตั้งรหัสผ่านที่ง่าย ตัวอย่าง 10 อันดับ

![at](https://devtech95.github.io/Day5_Password_strength/Pic/TOP10.PNG)

### บทความนี้จะแนะนำการตั้งรหัสผ่าน ที่ปลอดภัยหากปฏิบัติตามหัวข้อ ต่อไปนี้ทั้งหมด

1. It contains at least 8 characters and at most 20 characters. ( ประกอบด้วยอักขระอย่างน้อย 8 ตัวและไม่เกิน 20 อักขระ )
2. It contains at least one digit. ( ประกอบด้วยตัวเลขอย่างน้อยหนึ่งหลัก )
3. It contains at least one upper case alphabet. ( ประกอบด้วยอักษรตัวพิมพ์ใหญ่อย่างน้อยหนึ่งตัว )
4. It contains at least one lower case alphabet. ( ประกอบด้วยอักษรตัวพิมพ์เล็กอย่างน้อยหนึ่งตัว )
5. It contains at least one special character which includes !@#$%&*()-+=^. ( มีอักขระพิเศษอย่างน้อยหนึ่งตัวซึ่งรวมถึง! @ # $% & * () - + = ^ )
6. It doesn’t contain any white space. ( ไม่มีช่องว่างในรหัสผ่าน )

### ตัวอย่างการเขียน Regular Expressions

   regex = “^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8, 20}$”

### ตัวอย่างการ Code

![at](https://devtech95.github.io/Day5_Password_strength/Pic/Code.PNG)

### ตัวอย่างการ การตั้งรหัสผ่าน

![at](https://devtech95.github.io/Day5_Password_strength/Pic/Simple.PNG)

### ผลลัพธ์

![at](https://devtech95.github.io/Day5_Password_strength/Pic/result.PNG)

## บทความเป็นตัวอย่างการใช้งาน Function regex() ในภาษา JAVA อย่างคร่าว  ขอบคุณครับ

## Reference

> - <https://www.geeksforgeeks.org/how-to-validate-a-password-using-regular-expressions-in-java/>
> - <https://nordpass.com/most-common-passwords-list/>
