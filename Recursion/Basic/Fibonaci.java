class Fibonaci {

  public static int recursive(int n) {
    if (n == 0 || n == 1) {
      return n;
    }

    return recursive(n - 1) + recursive(n - 2);
  }

  public static void main(String[] args) {
    System.out.println(recursive(6));
  }
}
