
let nums = [4,5,4,15];
let target = 9;

// for(let i=0;i<nums.length;i++){
//     for(let j=0;j<nums.length;j++){
//       if(i != j){
//         if((nums[i] + nums[j]) === target){
//           console.log(i,j)
//           return;
//         }
//       }
//     }
// }

const map = new Map();


for(let i=0;i<nums.length;i++){
  let temp = target - nums[i];
  if(map.has(temp)){
    console.log(map.get(temp),i);
    return;
  }
  map.set(nums[i],i);
}