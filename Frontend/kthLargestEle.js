let arr = [7, 10, 4, 3, 20, 15];
let k = 3;


// wth sort method
// arr.sort((a,b)=> a - b);
// console.log(arr[k-1]);

// without sort method
for(let i=0;i<k;i++){
  for(let j=i+1;j<arr.length;j++){
    if(arr[i] > arr[j]){
      let temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
}

console.log(arr[k-1])