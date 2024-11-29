// let str = "aaaaabbbb";
// let ans = "";

// let count = 1;

// for (let i = 0; i < str.length; i++) {
//   if (i < str.length - 1) {
//     if (str[i] == str[i + 1] && count < 9) {
//       count++;
//     } else {
//       ans += count + str[i];
//       count = 1;
//     }
//   } else {
//     ans += count + str[i];
//     count = 1;
//   }
// }

// console.log(ans);

let str = "aaaaabbbb";
let ans = [];
let count = 1;

for (let i = 1; i <= str.length; i++) {
  if (str[i] === str[i - 1] && count < 9) {
    count++;
  } else {
    ans.push(count + str[i - 1]); 
    count = 1;
  }
}

console.log(ans.join('')); 
