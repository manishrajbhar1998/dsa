import java.util.ArrayList;

class KeyboardWord {

  public static void findWords(String[] words) {
    ArrayList<String> al = new ArrayList<>();

    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
        String wo = "";
        for(int j=0;j<words[i].length();j++) {
            char ch = charAt(words[i][j]);
            if(ch == 'Q' || ch == 'q'|| ch == 'W'|| ch == 'w'|| ch == )
        }
    }
  }

  public static void main(String[] args) {
    // String[] str = {"Hello","Alaska","Dad","Peace"};
    findWords({"Hello","Alaska","Dad","Peace"});
  }
}
