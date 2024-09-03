let s = "anagram";
let t = "nagaram";



s = s.split("").sort();
console.log(s);

t = t.split("").sort();
console.log(t);

if(s.length != t.length){
  return false;
}

for(let i=0;i<s.length;i++){
    if(s[i] != t[i]){
      return false;
    }
}

return true;
