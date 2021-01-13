## Javascript > verified during SSL/TLS connections




การตรวจสอบใบรับรอง X.509 ระหว่าง Server กับ Client เป็นสิ่งสำคัญในการสร้างเซสชัน SSL / TLS ที่ปลอดภัย ไม่เสี่ยงต่อการโจมตีจากคนตรงกลาง

การตรวจสอบใบรับรอง ประกอบด้วยขั้นตอนเหล่านี้:
1. ใบรับรองนี้ออกโดยผู้ออกใบรับรองหลักหรือ CA หลักที่ระบบเชื่อถือได้
2. CA แต่ละแห่งได้รับอนุญาตให้ออกใบรับรอง
3. ใบรับรองแต่ละรายการในเครือข่าย ไม่ควรหมดอายุ

# ตัวอย่างการเขียน Code  Noncompliant

![at](https://devtech95.github.io/Day4_verified_SSL_TLS/Pic/NonCompliant.PNG)

# ที่นี้เป็นตัวอย่างการเขียน Code Compliant

![at](https://devtech95.github.io/Day4_verified_SSL_TLS/Pic/Compliant.PNG)


## บทความเป็นตัวอย่างการใช้งาน Function https.request() ที่เป็น Standard built-in module: อย่างคร่าว  ขอบคุณครับ


Reference::
---------------------------------------
> - https://base64.guru/learn/base64-characters
> - https://www.digitalocean.com/community/tutorials/how-to-encode-and-decode-strings-with-base64-in-javascript
