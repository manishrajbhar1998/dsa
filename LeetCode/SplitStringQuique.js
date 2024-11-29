
let str = "addbsd";

let count = 0;

let arr = [];


for(let i=0;i<str.length-1;i++){
  for(let j=i+1;j<str.length;j++){
      arr.push(str.slice(i,j))
  }
}

console.log(arr);











// for(let i=0;i<str.length;i++){

//     if(!arr.includes(str[i])){
//       arr.push(str[i]);
//       count++;
//     }else{
//       if(i < str.length-1){
//           let temp = `${str[i]}${str[i+1]}`;
//           if(!arr.includes(temp))
//           arr.push(temp);
//           count++;
//           i++;
//       }
//     }
// }

// console.log(arr);
// console.log(count)