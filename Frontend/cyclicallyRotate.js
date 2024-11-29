let arr = [1, 2, 3, 4, 5];

let n = arr.length-1;

let lastEle = arr[n];

for(let i=n;i>0;i--){
  arr[i] = arr[i-1];
}

arr[0] = lastEle;

console.log(arr);

