let arr = [4, 7, 8, 6, 1, 5, 100, 4];


let min = arr[0];
let max = arr[0];

// for(let i=0;i<arr.length;i++){
//     if(min > arr[i]){
//       min = arr[i];
//     }

//     if(max < arr[i]){
//       max = arr[i];
//     }
// }
// console.log(min,max);

min = arr.reduce((a,b) => a <= b ? a : b);
max = arr.reduce((a,b) => a >= b ? a : b);
console.log(min,max);

