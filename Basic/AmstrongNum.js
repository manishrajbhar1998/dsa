
let num = 120;
let ref = num;
let temp = num;
let sum = 0;

let n = 0;

while(temp != 0){
    n++;
    temp = parseInt(temp / 10);
}

while(num != 0){
    let rem = num % 10;
    sum += Math.pow(rem,n)
    console.log(sum);
    num = parseInt(num / 10);
    console.log(num);
}

console.log(sum,ref);
if(sum == ref)console.log(true);
else console.log(false);