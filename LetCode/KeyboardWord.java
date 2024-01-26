import java.util.ArrayList;

class KeyboardWord {

  public static void findWords(String[] words) {
    ArrayList<String> al = new ArrayList<>();

    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }
  }

  public static void main(String[] args) {
    String[] str = { "Hello", "Alaska", "Dad", "Peace" };
    findWords(str);
  }
}
