let str = "geeksforgeeks";
// let str = "Maduam";

let count = 0;
let i = 0;
let j = str.length - 1;

while (i < j) {
  if (str[i].toLowerCase() != str[j].toLowerCase()) {
    if (i == j - 1) {
      count++;
    } else {
      count += 2;
    }
  }

  i++;
  j--;
}

console.log(count);
