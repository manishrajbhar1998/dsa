let str = "The quick brown fox jumps over the dog";
str = str.toUpperCase();

let alpha_charCode_arr = new Array(26).fill(false);
// console.log(alpha_charCode_arr);

for (let i = 0; i < str.length; i++) {
  if (str[i] >= "A" && str[i] <= "Z") {
    alpha_charCode_arr[str.charCodeAt(i) - 65] = true;
  }
}

console.log(alpha_charCode_arr);
let isPanagram = true;
for(let i=0;i<alpha_charCode_arr.length;i++){
    
    if(!alpha_charCode_arr[i]){
      isPanagram = false;
        console.log("Not a Panagram");
    }
}

if(isPanagram) console.log("Is a Panagram");
