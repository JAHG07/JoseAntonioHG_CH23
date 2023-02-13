// let miArray = [1,2,3,4,5,6];

// console.log(miArray[2]);

// let miArray1 = [[1,2,3],[4,5,6],[7,8,9]];

// console.log(miArray1[1][1]);
// console.log(miArray1[0][1]);
// console.log(miArray1[0][0]);
// console.log(miArray1[1]);
// console.log(miArray1[2]);

// for (let i =0 ; i<=10 ; i++){
//     console.log("imprimio ->" + i);
// }
// for (let i = 0; i<3; i++){
//     for(let j =0; j<3 ; j++){
//         console.log(miArray1[i][j]);
//     }
// }

// let matrizR= [
//     [],[],[]
// ]

// for (let i = 0; i < 3; i++) {
//     for (let j = 0; j < 3; j++) {
//         matrizR[i][j] = miArray1[i][j] * miArray1[i][j];
//     }
    
// }
// console.log("MatrizR->"+matrizR);

let nombres = ["sofia","david","juan"];

console.log(nombres.sort());
console.log(nombres.push("sara","agustin"));
console.log(nombres.sort());

for(let i = 1; i < 6 ; i++){
    console.log("*".repeat(i));
}

for (let i = 10 ; i >= 0 ; i-=0.5){
    console.log(i);
}
let i=-1;
while(i<99){console.log(i+=2)}
let n = 1;
while(n<6){
    console.log("[0]".replace(/\d/, n))
    n++;
}
let x = 0;
let r = 0;
while(x<19){
    console.log(r+=x+1);
    x++;
}
let lista = [1,2,3,4,5,6];
let lista2 = lista.slice;

for(let d = 0; d<lista.length;d++){
    console.log(lista[d])
}
console.log(lista);

let msg = lista.join("-");
console.log(msg);

let msg1 = lista.concat(100,200,300,55,66,88);
console.log(msg1);

lista.shift();
console.log(lista);

lista.pop();
console.log(lista);

lista.sort()
console.log(lista);

lista.reverse()
console.log(lista);

let numeros = [1,15,22,10,9];
console.log(numeros.sort((a,b)=>a-b));