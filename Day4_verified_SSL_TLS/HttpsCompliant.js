
//ตัวอย่าง Code https built-in module: Compliant
let options = {
    hostname: 'www.google.co.th',
    port: 443,
    path: '/',
    method: 'GET',
    secureProtocol: 'TLSv1_2_method'
  };
  
  let req = https.request(options, (res) => {
    res.on('data', (d) => {
      process.stdout.write(d);
      compliant = d;
    });
  }); // Compliant: by default rejectUnauthorized  is set to true



  