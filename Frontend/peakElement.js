let arr = [10, 20, 15, 2, 23, 90, 90];
// Output: 20 or 90

let ans = [];
for(let i=1;i<arr.length-1;i++){
    if((arr[i] >= arr[i-1]) && (arr[i] >= arr[i+1])){
      ans.push(arr[i]);
    }
}

console.log("ans :: ",ans);
