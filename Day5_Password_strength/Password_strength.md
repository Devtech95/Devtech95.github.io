# Java > Password Strength By java

## How to validate a Password using Regular Expressions in Java

     การตั้งรหัสผ่านในประจุบัน ยังมีการตั้งรหัสผ่านที่ง่าย ตัวอย่าง 10 อันดับ

![at](https://devtech95.github.io/Day5_Password_strength/Pic/TOP10.PNG)

### บทความนี้จะแนะนำการตั้งรหัสผ่าน ที่ปลอดภัยหากปฏิบัติตามหัวข้อ ต่อไปนี้ทั้งหมด

1. ใIt contains at least 8 characters and at most 20 characters. ()
2. It contains at least one digit.
3. It contains at least one upper case alphabet.
4. It contains at least one lower case alphabet.
5. It contains at least one special character which includes !@#$%&*()-+=^.
6. It doesn’t contain any white space.

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
