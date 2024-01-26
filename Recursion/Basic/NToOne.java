class NToOne {

  public static int rec(int n) {
    if (n == 0) {
      return 5;
    }

    System.out.println(n);
    return rec(n - 1);
  }

  public static void main(String[] args) {
    int n = rec(5);
    System.out.println("n :: " + n);
  }
}
// Dry Run
// rec(5) : 14 print 5 return 0
//     rec(4) : 8 print 4 return 0
//         rec(3) : 8 print 3 return 0
//             rec(2) : 8 print 2 return 0
//                 rec(1) : 8 print 1 return 0
//                     rec(0) : 8  return 0
