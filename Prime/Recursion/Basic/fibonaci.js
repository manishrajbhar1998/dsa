
// 0 1 1 2 3 5

// recursion way
function fibonaci(n){

  if(n < 2){
    return n;
  }

  const result = fibonaci(n-1) + fibonaci(n-2);
  return result;
  
}
// console.log(fibonaci(5));

export default fibonaci;


// itrative way
function fibonaciWithItration(n){
  let prev = 0;
  let curr = 1;
  n -= 2;
  while(n != 0){
    next = prev + curr;
    prev = curr;
    curr = next;
    n--;
  }

  return next;
}

// console.log(fibonaciWithItration(50));
