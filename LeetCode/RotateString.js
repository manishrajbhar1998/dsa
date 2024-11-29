let str = "abcde";
let goal = "cdeab";

// Input: s = "abcde", goal = "abced"

// for (let i = 0; i < str.length; i++) {
//   let n = str.length;
//   let index = str.length % i;

//   rotateArray(str, 0, n - 1);
//   rotateArray(str, 0, index - 1);
//   rotateArray(str, index, n - 1);

//   if (str == goal) {
//     return true;
//   }
// }

// return false;

// function rotateArray(str, start, end) {
//   while (start < end) {
//     let temp = str[start];
//     str[start] = str[end];
//     str[end] = temp;
//   }

//   return str;
// }
