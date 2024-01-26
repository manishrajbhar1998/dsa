import java.util.*;

class OneToNOpt {

  public static void main(String[] args) {
    int n = 100;

    boolean[] primeArr = new boolean[n + 1];

    Arrays.fill(primeArr, true);
    primeArr[0] = false;
    primeArr[1] = false;

    for (int i = 2; i * i <= n; i++) {
      if (primeArr[i] == true) {
        for (int j = i * i; j <= n; j += i) {
          primeArr[j] = false;
        }
      }
    }

    for (int i = 2; i < primeArr.length; i++) {
      if (primeArr[i] == true) {
        System.out.println(primeArr[i] + " " + i);
      }
    }
  }
}
