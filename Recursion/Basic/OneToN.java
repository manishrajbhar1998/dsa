class OneToN {

  public static void rec(int n) {
    if (n == 0) {
      return;
    }

    rec(n - 1);
    System.out.println(n);
  }

  public static void main(String[] args) {
    rec(5);
  }
}
// Dry Run
// rec(5) : 13 print 1 **
//     rec(4) : 8 print 2 **
//         rec(3) : 8 print 3 **
//              rec(2) : 8  print 4 **
//                 rec(1) : 8  print 1 **
//                     rec(0) : 8 **
