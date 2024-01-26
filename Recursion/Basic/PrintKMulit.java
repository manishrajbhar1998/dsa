class PrintKMulit {

  public static void resolve(int num, int k) {
    if (k == 0) {
      return;
    }

    resolve(num, k - 1);
    System.out.println(num * k);
  }

  public static void main(String[] args) {
    resolve(5, 5);
  }
}
