let arr = [170, 45, 75, 90, 802, 24, 2, 66];

// sort method
// let ans = arr.sort((a,b) => a - b);
// console.log(ans)

// using bubble sort
// for(let i=0;i<arr.length-1;i++){
//   for(let j=i+1;j<arr.length;j++){
//     if(arr[i] > arr [j]){
//       let temp = arr[i];
//       arr[i] = arr[j];
//       arr[j] = temp;
//     }
//   }
// }
// console.log(arr);

// merge sort

function mergeSort(arr) {
  if (arr.length <= 1) {
    return arr;
  }
  let mid = Math.floor(arr.length / 2);
  let left = mergeSort(arr.slice(0, mid));
  let right = mergeSort(arr.slice(mid));
  return merge(left, right);
}

console.log(mergeSort(arr));

function merge(leftArr, rightArray) {
  let result = [];
  let leftIndex = 0;
  let rightIndex = 0;

  while ((leftIndex < leftArr.length) && (rightIndex < rightArray.length)) {
    if (leftArr[leftIndex] < rightArray[rightIndex]) {
      result.push(leftArr[leftIndex]);
      leftIndex++;
    } else {
      result.push(rightArray[rightIndex]);
      rightIndex++;
    }
  }

  while (leftIndex < leftArr.length) {
    result.push(leftArr[leftIndex]);
    leftIndex++;
  }

  while(rightIndex < rightArray.length){
    result.push(rightArray[rightIndex]);
    rightArray++;
  }

  return result;
}
