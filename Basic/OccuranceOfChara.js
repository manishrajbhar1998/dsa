let str = "Hello world";

let obj = {};

for(let i=0;i<str.length;i++){

    let char = str[i];
    if (obj[char]){
        obj[char] = ++obj[char];
    }else{
        obj[char] = 1;
    }
}

console.log(obj);