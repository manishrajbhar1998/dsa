let arr = [1,2,3,4,2,1];

let obj = {};
let ans = [];

// Approach 1
// arr.forEach((ele) => {
//   obj[ele] = ele;
// });

// for (key in obj) {
//   ans.push(key);
// }
// console.log(ans);

// Approach 2
ans = arr.filter((currEle,index,arr) => arr.indexOf(currEle) == index);
console.log(ans);

// Find repeated Elements
ans = arr.filter((currEle,index,arr) => arr.indexOf(currEle) != index);
console.log(ans);


