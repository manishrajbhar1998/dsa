class SqureRoot {

  public static void main(String[] args) {
    int n = 50;

    int s = 1;
    int e = n;
    int ans = 0;

    while(s <= e){
      int m = s + (e - s)/2;

      if( m * m > n){
        e = m -1;
      }else{
        ans = m;
        s = m+1;

      } 
    }

    System.out.println("sqRoot :: "+ans);
  }
}
