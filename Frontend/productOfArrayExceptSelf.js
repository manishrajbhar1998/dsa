//Input: nums = [1,2,3,4]
// Output: [24,12,8,6]

let nums = [1, 2, 3, 4];
let ans = [];

// for(let i=0;i<nums.length;i++){
//   let pro = 1;
//   for(let j=0;j<nums.length;j++){
//       if(i != j){
//         pro *= nums[j];
//       }
//   }
//   ans.push(pro);
// }
// console.log(ans);

let prefixPro = [];
prefixPro[0] = nums[0];
for (let i = 1; i < nums.length; i++) {
  prefixPro[i] = prefixPro[i - 1] * nums[i];
}

let suffixPro = [];
suffixPro[nums.length - 1] = nums[nums.length - 1];

for (let i = nums.length - 2; i >= 0; i--) {
  suffixPro[i] = suffixPro[i + 1] * nums[i];
}

for(let i=0;i<nums.length;i++){
    if(i == 0){
      ans.push(suffixPro[1])
    }else if(i == nums.length-1){
      ans.push(prefixPro[nums.length-2])
    }else{
      ans.push(prefixPro[i-1] * suffixPro[i+1])
    }
}

console.log(ans);
