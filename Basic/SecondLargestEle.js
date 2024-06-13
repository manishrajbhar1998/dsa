let arr = [10, 15, 42, 18, 50,100]; 

let ans = [];

// Approach 1
// ans = arr.sort((a,b)=> b-a);
// console.log(ans[1]);

// Approach 2
let firstLargest = arr[0] > arr[1] ? arr[0] : arr[1];
let secondLargest = firstLargest > arr[0] ? arr[0] : arr[1];

for (let i = 2; i < arr.length; i++) {
  if (firstLargest < arr[i]) {
    secondLargest = firstLargest;
    firstLargest = arr[i];
  }
}
console.log(secondLargest);
