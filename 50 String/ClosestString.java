/**
 * ClosestString
 */
class ClosestString {

  public static void main(String[] args) {

    String[] str = { "the", "quick","brown", "quick","foxs",};
    String word1 = "the";
    String word2 = "fox";

    boolean word1Flag = false;
    int count = 0;
    int ans = Integer.MAX_VALUE;
    for(int i=0;i<str.length;i++){
        if(word1.equals(str[i])){
            count = 0;
            word1Flag = true;
        }

        if(word1Flag == true){
          count++;
          if(word2.equals(str[i])){
            ans = Math.min(ans,count);
          }
        }
    }

    if(ans != Integer.MAX_VALUE){
      System.out.println("ans : "+ (ans-1));
    }else{
      System.out.print("No pair found");
    }

  }
}