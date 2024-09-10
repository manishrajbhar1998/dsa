let arr = [4, 7, 8, 6, 1, 5, 7, 4];
let target = 11;
let ans = [];
// 1 method
// for (let i = 0; i < arr.length - 1; i++) {
//   for (let j = i + 1; j < arr.length; j++) {
//     let sum = arr[i] + arr[j];
//     if (sum === target) {
//       let isNewList = true;
//       for (let k = 0; k < ans.length; k++) {
//         if (ans[k].includes(arr[i]) && ans[k].includes(arr[j])) {
//           isNewList = false;
//           break;
//         }
//       }
//       if(isNewList) ans.push([arr[i], arr[j]]);
//     }
//   }
// }

// console.log(ans);


// method 2
let map = new Map();
for (let i = 0; i < arr.length; i++) {
  let temp = target - arr[i];
  if (map.has(temp)) {
    let isNewList = true;
    for (let k = 0; k < ans.length; k++) {
      if (ans[k].includes(arr[i]) && ans[k].includes(temp)) {
        isNewList = false;
        break;
      }
    }
    if (isNewList) ans.push([arr[i], temp]);
  }
  map.set(arr[i], i);
}
console.log(map);
console.log(ans);
