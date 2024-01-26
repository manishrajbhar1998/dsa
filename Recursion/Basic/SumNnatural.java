class SumNnatural {

  public static int rec(int n) {
    if (n == 0) {
      return 0;
    }

    // int res = rec(n - 1);
    // int myResult = res + n;
    // return myResult;

    return rec(n - 1) + n;
  }

  public static void main(String[] args) {
    System.out.println(rec(6));
  }
}
