function demo(n) {
  if (n == 0) {
    return;
  }
  demo(n-1);
  console.log(n," hello");
  
  
}

demo(5);
