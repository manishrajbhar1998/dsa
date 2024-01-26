class AlternativeSign {

  public static int resolve(int n) {
    if (n == 0) {
      return 0;
    }

    if (n % 2 == 0) return resolve(n - 1) - n;
    return resolve(n - 1) + n;
  }

  public static void main(String[] args) {
    System.out.println(resolve(5));
  }
}
