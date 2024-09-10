var pivotIndex = function(nums) {
    
  for(let i=1;i<nums.length;i++){
      nums[i] += nums[i-1];
  }

  let index = -1;
  for(let i=0;i<nums.length;i++){
      let leftsum = 0;
      let rightsum = 0;

      if(i != 0){
          leftsum = nums[i-1];
      }
      rightsum = nums[nums.length-1] - nums[i];
      if(leftsum == rightsum){
          index = i;
      }

    }
    console.log(index);

};

pivotIndex([1,7,3,6,5,6])