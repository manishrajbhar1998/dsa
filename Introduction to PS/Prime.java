class Prime {

  public static int factor(int n) {
    int count = 0;

    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        if (i == n / i) {
          count++;
        } else {
          count += 2;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int n = 2;

    int count = factor(n);

    if (n == 2) {
      System.out.println(n + " is a prime number");
    } else {
      System.out.println(n + " is not a prime number");
    }
  }
}
