let s = "anagram";
let t = "nagaram";



s = s.split("").sort();
console.log(s);

t = t.split("").sort();
console.log(t);

console.log( s === t);
