class OneToN {

  public static boolean checkPrime(int n) {
    int count = 0;

    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        if (i == n / i) {
          count++;
        } else {
          count += 2;
        }
      }
    }

    if (count == 2) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    int n = 100;

    for (int i = 2; i <= n; i++) {
      if (checkPrime(i)) {
        System.out.println(i);
      }
    }
  }
}
