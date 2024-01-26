


function sumOfArray(arr,n){

  if(arr.length == 0){
    return 0;
  }
  if(n == 0){
    return arr[0];
  }

  return arr[n] + sumOfArray(arr,n-1);


}


// let arr = [1,2,3,4,5];
// let n = arr.length-1;
// console.log(sumOfArray(arr,n));

export default sumOfArray;



