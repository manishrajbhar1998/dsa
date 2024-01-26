class MagicalNum {

  public static int gcd(int A, int B) {
    if (B == 0) {
      return A;
    }

    return gcd(B, A % B);
  }

  public static void main(String[] args) {
    int A = 4, B = 2, C = 3;
    int lcm = gcd(A, B) / (A * B);

    int l = 1;
    int h = A * Math.min(A, B);
    int ans = 1;

    while (l <= h) {
      int m = (l + h) / 2;
      int count = m / A + m / B - m / lcm;

      if (count < C) {
        l = m + 1;
      } else {
        ams = m;
        h = m - 1;
      }
    }
  }
}
