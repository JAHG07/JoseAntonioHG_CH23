const parrotSay = require('parrotsay-api')
 
parrotSay('Hola que ashe')
  .then(console.log)
  .catch(console.error)