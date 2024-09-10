let arr = [1, 1, 2, 2, 2, 2, 3];
let x = 2;

let count = 0;
// way one
// for(let i=0;i<arr.length;i++){
//   if(arr[i] === x) count++;
// }
// console.log(count);

let i = 0;
let j = arr.length;

while (i <= j) {
  let mid = Math.floor((i+j)/2);

  if (x === arr[mid]) {
    let s = mid;
    let e = mid;

    while (s > 0 && x === arr[s]) {
      s--;
    }

    while (e < arr.length-1 && x === arr[e]) {
      e++;
    }

    for (let start = s; start <= e; start++) {
      if(x === arr[start]) count++;
    }
    break;
  }else if (x < arr[mid]) {
    j = mid-1;
  }else{
    i = mid + 1;
  }
}

console.log(count);
