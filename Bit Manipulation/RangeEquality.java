class RangeEquality {

  public static void main(String[] args) {
    int A = 5;
    int bit = 0;
    int temp = A;
    while (temp > 0) {
      bit++;
      temp = temp >> 1;
    }

    int x = A;
    int y = A;

    for (int i = 0; i < 32; i++) {
      if (i < bit) {
        x = x | (1 << i);
      }
    }
    System.out.println("x = " + x);
  }
}
