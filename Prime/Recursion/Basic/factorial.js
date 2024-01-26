

// 1x2x3x4x5 = 120

export default function factorial(n){
  if(n == 1) return 1;
  return n * factorial(n-1);
}

// factorial(5);