let names = [ "Antony", "Joy", "Juan" ,"Maria"];
let namess = ["Maria", "Joel", "Jesus", "Juan"];
console.log(names.push("Toño"));

console.log(names.some(a=>a=="Maria"));

// let arr =[];
// names.forEach((a,i)=>{if(a==namess[i])arr.push(a)});
// console.log(arr)

let arr1 =[];
names.forEach((a,i)=>{arr1[i]=a.length});
console.log(arr1)

// console.log(false || (true && false));
// console.log(true || (11 + 12));
// console.log((31 + 22) || true);
// console.log(true && (1 + 7));
// console.log(false && (3 + 4));
// console.log((1 + 2) && true);
// console.log((32 * 4) >= 129);
// console.log(false !== !true);
// console.log(true === 4);
// console.log(false === (847 === '847'));
// console.log(false === (887 == '887'));
// console.log((!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false);

// compare = (a)=>{
//     if(a>0&&a<26)console.log(a + " is between 0 and 25 ")
//     else if(a>=26&&a<=100)console.log(a + " is between 26 and 100")
//     else if(a>100)console.log(a + " 'is greater than 100' ")
//     else console.log(a +" is less than 0");
// }
// compare(-1);

// var a;
// var b = null;
// var c = undefined;
// var d = 4;
// var e = 'five';
// var f = a || b || c || d || e;

// console.log(f);