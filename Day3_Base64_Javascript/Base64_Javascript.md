## Javascript > Encode and Decode Base64

<img align="center" width="600" height="200" src="https://devtech95.github.io/Day3_Base64_Javascript/Pic/EncodeDecode.gif">


Base64 คือ standard format ของข้อมูลรูปแบบหนึ่ง โดยรูปแบบข้อมูลจะประกอบไปด้วยตัวอักษรพิมพ์เล็ก พิมพ์ใหญ่ของภาษาอังกฤษ a-z, A-Z ตัวเลข 0–9และ อักขระอีก 2 ตัวคือ + กับ / ทั้งหมด 64 ตัวอักษร ซึ่งหากใครต้องการใช้ standard นี้ ต้องแปลงข้อมูลให้สอดคล้องกับ format ของ Base64 ซึ่งขั้นตอนนี้จะถูกเรียกว่า การ Encoding

# วิธีการ Encoding
เริ่มจากนำข้อมูลต้นทางมาแปลงเป็นรูปแบบ Byte ก่อน จากนั้นก็นำข้อมูลมาเรียง Bit ( 1 Byte = 8 Bits) ตามปกติแล้วนำมาเปรียบเทียบกับตารางอักขระของ Base64 โดยใช้จำนวน 6 Bits เพื่อเป็นรหัสอ้างอิงแทนแต่ละอักษรครับ ตามตารางดังนี้

![at](https://devtech95.github.io/Day3_Base64_Javascript/Pic/Base64Characters.PNG)

# ในตัวอย่างนี้จะใช้ btoa() และ atob()
    โดย btoa() และ atob() เป็นฟังก์ชันตัวช่วย Base64 สองฟังก์ชันที่เป็นส่วนหลักของข้อกำหนด HTML และมีอยู่ในเบราว์เซอร์สมัยใหม่ทั้งหมด

# ตัวอย่าง Code 

![at](https://devtech95.github.io/Day3_Base64_Javascript/Pic/Simplecode.PNG)

# ตัวอย่างลอง Encode and Decode URL https://devtech95.github.io

![at](https://devtech95.github.io/Day3_Base64_Javascript/Pic/Showcase.PNG)


## บทความเป็นตัวอย่างการใช้งาน Function btoa() และ atob() อย่างคร่าว  ขอบคุณครับ


Reference::
---------------------------------------
> - https://base64.guru/learn/base64-characters
> - https://www.digitalocean.com/community/tutorials/how-to-encode-and-decode-strings-with-base64-in-javascript
