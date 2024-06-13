let arr = [12,45,785,63,2,10,15];

let ans = [];

// Approach 1 sort and get 1 and last ele
// ans = arr.sort((a,b)=> a - b);
// console.log(ans[0],ans[ans.length-1]);

// Approach 2
// let max = Number.MIN_SAFE_INTEGER;
// let min = Number.MAX_SAFE_INTEGER;

// for(let i=0;i<arr.length;i++){
//     if(arr[i] < min){
//       min = arr[i];
//     }

//     if(arr[i] > max){
//       max = arr[i];
//     }
// }
// console.log(min,max);

// Approach 3 
let min  = arr.reduce((prev,curr) => prev < curr ? prev : curr);
let max  = arr.reduce((prev,curr) => prev > curr ? prev : curr);
console.log(min,max);





