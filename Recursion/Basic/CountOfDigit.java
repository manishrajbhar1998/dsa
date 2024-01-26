class CountOfDigit {

  public static int resolve(int n) {
    if (n >= 0 && n <= 9) {
      return 1;
    }

    return 1 + resolve(n / 10);
  }

  public static void main(String[] args) {
    int n = 12345;
    System.out.println(resolve(n));
  }
}
