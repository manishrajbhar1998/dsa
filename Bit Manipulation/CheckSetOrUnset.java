class CheckSetOrUnset {

  public static void main(String[] args) {
    int n = 34;
    int i = 3;

    if((n & (1 << i)) == 0){
      System.out.println(n & (1 << i));
      System.out.println("No");
    }else{
      System.out.println(n & (1 << i));
      System.out.println("Yes");
    }
  }
}
