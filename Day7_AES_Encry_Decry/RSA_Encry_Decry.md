# Java > AES encryption and decryption

## วันนี้เรามาลอง เข้ารหัสลับ และ ถอดรหัสลับ ไปกลับ Code Java กันครับ ว่าแต่ AES คืออะไร เรามาทำความรู้จักแบบคร่าวๆ กัน 

   AES เป็นหนึ่งในการเข้ารหัสแบบสมมาตร หรือ Symmetric Encryption เป็นกระบวนการเข้ารหัสและถอดรหัสที่เป็นกระบวนการแบบเดียวกัน ในการเข้ารหัสแบบนี้ บางครั้งก็จะเรียกว่า การเข้ารหัสแบบ Secret Key

## หลักการของ Secret Key

![at](https://devtech95.github.io/Day7_AES_Encry_Decry/Pic/keyshare.png)

+ Plaintext Input หมายถึง ข้อความเริ่มแรกที่ยังไม่ได้เข้ารหัส และมีความต้องการที่จะเข้ารหัส
+ Encryption Algorithm เป็นกระบวนการแปลงข้อความ Plaintext ไปเป็นข้อความที่ไม่สามารถอ่านได้
+ Secret Key เป็นรหัสที่ต้องป้อนเข้าไปในกระบวนการเข้ารหัส โดยการแปลงข้อความของอัลกอริทึมในการเข้ารหัส จะขึ้นกับ Secret Key ที่ป้อนเข้าไป
+ Ciphertext เป็นผลลัพธ์ที่ได้จากการเข้ารหัส โดยจะขึ้นกับ Plaintext และ Secret Key ที่ป้อนเข้าไป ข้อความที่เหมือนกัน แต่มี Key ที่ต่างกัน จะให้ผลลัพธ์ที่ต่างกันด้วย
+ Decryption Algorithm เป็นกระบวนการย้อนกลับของการเข้ารหัส โดยเมื่อใส่ Ciphertext และ Key ที่ถูกต้องเข้าไป จะต้องได้ข้อความเดิมหรือ Plaintext ออกมา


### ตัวอย่างการเขียนโปรแกรม Encrypt AES

![at](https://devtech95.github.io/Day7_AES_Encry_Decry/Pic/encrypt.PNG)

### ตัวอย่างการเขียนโปรแกรม Decrypt AES

![at](https://devtech95.github.io/Day7_AES_Encry_Decry/Pic/Decrypt.PNG)

### ตัวอย่างการเขียนโปรแกรม Main

![at](https://devtech95.github.io/Day7_AES_Encry_Decry/Pic/Main.PNG)

### ผลลัพธ์

![at](https://devtech95.github.io/Day7_AES_Encry_Decry/Pic/Result.PNG)

## บทความนี้เป็นตัวอย่างการใช้งาน Encrypt and Decrypt AES ในภาษา JAVA อย่างคร่าว  ขอบคุณครับ

## Reference

> - <https://mkyong.com/java/java-aes-encryption-and-decryption//>
> - <https://medium.com/terrys-blog/%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B9%80%E0%B8%82%E0%B9%89%E0%B8%B2%E0%B8%A3%E0%B8%AB%E0%B8%B1%E0%B8%AA%E0%B8%A5%E0%B8%B1%E0%B8%9A%E0%B9%81%E0%B8%9A%E0%B8%9A%E0%B8%AA%E0%B8%A1%E0%B8%A1%E0%B8%B2%E0%B8%95%E0%B8%A3-symmetric-encryption-bb8c8aad31db/>
