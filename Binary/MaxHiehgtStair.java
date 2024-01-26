class MaxHiehgtStair {

  public static void main(String[] args) {
    int s = 20;

    int l = 1, h = s;

    int ans = 0;

    while (l <= h) {
      int m = (l + h) / 2;

      int tem = m * (m + 1) / 2;

      if (tem <= s) {
        ans = m;
      }

      if (tem > s) {
        h = m - 1;
      } else {
        l = m + 1;
      }
    }

    System.out.println(ans);
  }
}
