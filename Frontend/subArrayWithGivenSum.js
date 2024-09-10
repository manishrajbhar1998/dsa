let arr = [15, 2, 4, 8, 9, 5, 10, 23];
let k = 23;


let s = -1;
let e = -1;

for(let i=0;i<arr.length;i++){
  let sum = 0;
    for(let j=i;j<arr.length;j++){
      sum += arr[j];
      if(sum === k){
        console.log(i,j);
        return
      }
    }
}