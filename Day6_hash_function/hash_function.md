# Java > Hash Function + salt in Java

![at](https://devtech95.github.io/Day6_hash_function/Pic/hashsalt.gif)

## วันนี้เรามาลองเรียนรู้การใช้ Hash Function + salt ว่าแต่ Hash Function คืออะไร
  
   ฟังก์ชันแฮช (Hash function) คือ วิธีการที่ทำให้ข้อมูลย่อลงแต่มีลักษณะจำเพาะของข้อมูลนั้น โดยอาจกระทำโดยการแบ่งข้อมูลออกเป็นส่วนๆ ผ่านวิธีการใดๆแล้วนำกลับมารวมกัน เรียกว่า ค่าแฮช (hash value)

### คุณสมบัติของฟังก์ชันแฮช (Hash function)

+ ข้อมูลแต่ละตัวเมื่อผ่านฟังก์ชันแฮชแล้วจะต้องมีค่าไม่เท่ากัน มีลักษณะที่จำเพาะแต่ล่ะข้อมูล
+ หาค่าแฮชจากข้อมูลควรทำได้ง่ายและรวดเร็ว
+ เมื่อข้อมูลผ่านฟังก์ชันแฮชแล้วไม่ควรทำย้อนกลับได้
+ การบวนการแฮชควรมีการกระจายตัวสูง ข้อมูลใดๆที่ผ่านฟังก์ชันแฮชควรมีขนาดเท่ากัน แต่ไม่เหมือนกัน

### ทำไมต้องมีฟังก์ชันแฮช?

+ เพื่อใช้ตรวจสอบว่าข้อมูลมีการเปลี่ยนแปลงหรือไม่
+ เพื่อใช้เก็บข้อมูลสำหรับเปรียบเทียบ โดยการเปรียบเทียบข้อมูลจะทำได้รวดเร็วขึ้น
+ ทำให้เป็นภาษาที่มนุษย์อ่านไม่เข้าใจ
+ หากข้อมูลที่จะใช้เปรียบเทียบมีขนาดใหญ่มาก จะช่วยย่อข้อมูลให้เล็กลงได้มาก แต่ขึ้นอยู่กับวิธีของฟังก์ชันแฮช

### แล้ว salt ล่ะ คืออะไร

   salt คือ random string เพื่อใช้รวมกับค่า hash value ที่ได้จากการทำ Hash function รอบแรก   เพื่อที่จะไม่สามารถ rainbow table หรือ brutefoce ในการ crack ได้ง่าย การใช้ salt ร่วมด้วยโดยส่วนมาก จะใช้ในการเก็บ Password ลง Database

### ตัวอย่าง อธิบายด้วยภาพ

![at](https://devtech95.github.io/Day6_hash_function/Pic/showhash.png)


### ตัวอย่างการเขียนโปรแกรม

![at](https://devtech95.github.io/Day6_hash_function/Pic/Code.PNG)


### ผลลัพธ์

![at](https://devtech95.github.io/Day6_hash_function/Pic/Result.PNG)

## บทความนี้เป็นตัวอย่างการใช้งาน HASH Function + SALT ในภาษา JAVA อย่างคร่าว  ขอบคุณครับ

## Reference

> - <https://www.baeldung.com/java-password-hashing/>
> - <https://medium.com/@TechExpertise/java-cryptographic-hash-functions-a7ae28f3fa42/>
