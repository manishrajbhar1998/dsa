class Factorial {

  public static int recursion(int n) {
    if (n == 1) return 1;

    return n * recursion(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(recursion(3));
  }
}
