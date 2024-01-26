class BackSpaceString {

  public static void main(String[] args) {
    String s = "ab#c", t = "ad#c";

    char[] arr = s.toCharArray();
    int n = arr.length;

    String ans1 = "";
    for (int i = 0; i < n; i++) {
      if (arr[i] == '#') {
        if (i + 1 < n) {
          ans1 += arr[i + 1];
          ++i;
        }
      } else {
        ans1 += arr[i];
      }
    }

    System.out.println(ans1);
  }
}
