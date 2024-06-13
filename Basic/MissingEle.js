let arr = [1,2,5,6,4,9,10]; // 3 7 8 

let min = Math.min(...arr);
let max = Math.max(...arr);
let missingNums = [];

// Approach 1
for(let i = min;i<=max;i++){
    if(arr.indexOf(i) < 0){
      missingNums.push(i);
    }
}
console.log(missingNums);

