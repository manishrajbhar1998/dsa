/**
 * EncryptString2
 */
public class EncryptString2 {

  public static char hexadsecimal(int n) {
    if (n == 10) {
      return 'A';
    } else if (n == 11) {
      return 'B';
    } else if (n == 12) {
      return 'C';
    } else if (n == 13) {
      return 'D';
    } else if (n == 14) {
      return 'E';
    } else {
      return 'F';
    }
  }

  public static void main(String[] args) {

    // String str = "aaaaaaaaaaa";
    String str = "abbccdeffffffffff";
    str = str.trim();

    String strHxa = "";

    char ch = str.charAt(0);
    int countOfCh = 1;
    boolean flag = false;
    for (int i = 0; i < str.length(); i++) {
      if (ch == str.charAt(i)) {
        if(flag == true){
          countOfCh++;
        }
        flag = true;
      } else {
        if (countOfCh <= 9) {
          strHxa += ch + "" + countOfCh;
        } else {
          strHxa += ch + ""+ hexadsecimal(countOfCh);
        }
        countOfCh = 1;
        // flag = false;
        ch = str.charAt(i);
      }
    }
    countOfCh++;
    if (flag) {
      if (countOfCh <= 9) {
        strHxa += ch + "" + countOfCh;
      } else {
        strHxa += ch +""+ hexadsecimal(countOfCh);
      }
    }

    String ans = "";
    for(int i=strHxa.length()-1;i>=0;i--){
      ans += strHxa.charAt(i);
    }

    System.out.println("ans :: " + ans);

  }
}