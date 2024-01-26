class Basic {

  public static void recurion(int n) {
    if (n == 0) {
      return;
    }

    System.out.println(n);
    recurion(n - 1);
  }

  public static void main(String[] args) {
    recurion(5);
  }
}
