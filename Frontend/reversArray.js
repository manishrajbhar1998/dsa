
let arr = [4, 5, 1, 2,10];
let startIndex = 0;
let endIndex = arr.length-1;


while(startIndex < endIndex){
    let temp = arr[startIndex];
    arr[startIndex] = arr[endIndex];
    arr[endIndex] = temp;
    startIndex++;
    endIndex--;
}

console.log(arr);