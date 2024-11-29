let arr = [2,3,5,6,7];
let set = new Set(arr);
arr = [...set];
arr = arr.sort((a,b)=> a - b);
let ans = [];
let final = [];

console.log(arr);

let temp;

for (let i = 0; i < arr.length; i++) {
  let num = arr[i];
  console.log(final);
  if (final.length == 0) {
    ans.push(num);
    final.push(ans);
    ans = [];
  } else {
    let temp1 = Math.pow(num, 2);
    let temp2 = Math.sqrt(num);
    let flag = true;
    for (let j = 0; j < final.length; j++) {
      if (final[j].includes(temp1) || final[j].includes(temp2)) {
        final[j].push(num);
        flag = false;
        break;
      }
    }

    if (flag) {
      ans.push(num);
      final.push(ans);
      ans = [];
    }
  }
}

let count = 0;
for (let i = 0; i < final.length; i++) {
  if (count < final[i].length) {
    count = final[i].length;
  }
}

console.log(count);
