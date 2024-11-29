let str = "Madam";

let i = 0;
let j = str.length - 1;

let flag = true;
while (i < j) {
  if (str[i].toLocaleLowerCase() != str[j].toLocaleLowerCase()) {
    flag = false;
    console.log("Is not a Palindrome");
    break;
  }
  i++;
  j--;
}

if (flag) console.log("Is Palindrome");

