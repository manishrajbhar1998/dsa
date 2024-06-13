let str = "MAM";

let flag = true;

let i=0;
let j=str.length-1;

while(i<=j){
  if(str[i] != str[j]){
    flag = false;
    break;
  }
  i++;
  j--;
}

console.log(flag);



