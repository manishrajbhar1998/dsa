let str =  ["apple", "ape", "april"];
let logLen = 0;


for(let i=0;i<str.length;i++){
    if(logLen < str[i].length){
      logLen = str[i].length;
    }
}


let i = 0;
let k = 0;
let ans = ""

while(i < logLen){
    let flag = true;
    for(let j=0;j<str.length-1;j++){
        if(str[j][i] !== str[j+1][i]){
          flag = false;
        }
    }
    if(flag){
        k = i;
        ans += str[0][i];
    }else{
      break;
    }

    i++;
}

console.log(str[0].slice(0,k+1));
console.log(k)
console.log(ans);



