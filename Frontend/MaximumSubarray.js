// let arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
// let max = Number.MIN_SAFE_INTEGER;
// for (let i = 0; i < arr.length; i++) {
//   for (let j = i; j < arr.length; j++) {
//     let sum = 0;
//     for (let k = i; k <= j; k++) {
//       sum += arr[k];
//     }
//     max = max < sum ? sum : max;
//   }
// }

let arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
let max = Number.MIN_SAFE_INTEGER;
let prefixSum = [];
prefixSum[0] = arr[0];
for (let i = 1; i < arr.length; i++) {
  prefixSum[i] = prefixSum[i - 1] + arr[i];
}

for (let i = 0; i < arr.length - 1; i++) {
  let left = 0,right = 0;
  if (i != 0) {
    left = prefixSum[i - 1];
  }
  right = prefixSum[i + 1];
  let sum = left + right;
  max = max < sum ? sum : max;
}
console.log(max);
