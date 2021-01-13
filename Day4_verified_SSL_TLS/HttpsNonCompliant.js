
const https = require('https');

//ตัวอย่าง Code https built-in module: Noncompliant
let options = {
hostname: 'www.google.co.th',
port: 443,
path: '/',
method: 'GET',
secureProtocol: 'TLSv1_2_method',
rejectUnauthorized: false // Noncompliant
};

let req = https.request(options, (res) => {
res.on('data', (d) => {
  process.stdout.write(d);
  
});
}); // Noncompliant
