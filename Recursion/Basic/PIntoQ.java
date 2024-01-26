class PIntoQ {

  public static int resolve(int p, int q) {
    if (q == 0) {
      return 1;
    }

    // return p * resolve(p, q - 1);  approach 1
    int num = resolve(p, q / 2);
    if (q % 2 == 0) {
      return num * num;
    } else {
      return p * (num * num);
    }
  }

  public static void main(String[] args) {
    int p = 2;
    int q = 8;

    System.out.println(resolve(p, q));
  }
}
