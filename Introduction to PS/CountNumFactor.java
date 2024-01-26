class CountNumFactor {

  public static void main(String[] args) {
    int n = 36;

    int count = 0;

    // brute force algorithm
    // for (int i = 1; i <= n; i++) {
    //   if (n % i == 0) {
    //     count++;
    //   }
    // }
    // System.out.println("count :: " + count);

    for (int i = 1; i * i <= n; i++) {
      if (n % i == 0) {
        if (i == n / i) {
          count++;
        } else {
          count += 2;
        }
      }
    }

    System.out.println("count :: " + count);
  }
}
