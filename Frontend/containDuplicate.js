
let nums = [1,2,3,1];



// const set  = new Set();
// let flag = true;

// for(let i=0;i<nums.length;i++){
//   if(set.has(nums[i])){
//     flag = false;
//     console.log(true)
//     return true;
//   }

//   set.add(nums[i]);
// }

// if(flag){
//   console.log(false);
//   return false
// }

const set = new Set(nums);
return set.size != nums.length;