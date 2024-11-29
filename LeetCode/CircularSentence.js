

let sentence = "leetcode exercises sound delightful";

if(sentence[0] != sentence[sentence.length-1]){
  return false;
}

sentence = sentence.split(" ");

console.log("sentence :: ",sentence)

for(let i=0;i<sentence.length-1;i++){
    let curr = sentence[i];
    let next = sentence[i+1]
    if(curr[curr.length-1] != next[0]){
      return false;
    }
}

return true;