class CheckSetOrUnset {

  public static void main(String[] args) {
    int n = 21;
    int i = 2;

    if ((n & (1 << i)) == 0) {
      System.out.println(n & (1 << i));
      System.out.println(false);
    } else {
      System.out.println(n & (1 << i));
      System.out.println(true);
    }
    // if((n & (1 << i)) == 0){
    //   System.out.println(n & (1 << i));
    //   System.out.println("No");
    // }else{
    //   System.out.println(n & (1 << i));
    //   System.out.println("Yes");
    // }
  }
}
