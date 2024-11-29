
let s = "a";
let ans = s[0];

for(let i=1;i<s.length;i++){
    if(s[i] != s[i-1] || s[i] != s[i+1]){
        ans += s[i];
    }
}

console.log(ans)