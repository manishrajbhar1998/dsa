public class MinimumDeletion {
  
  public static void main(String[] args) {
     
      String str = "abca";
      int count = 0;

      int i = 0;
      int j = str.length()-1;

      while( i < j){

          if(str.charAt(i) != str.charAt(j)){
            count += 2;
          }

          i++;
          j--;
      }

      System.out.println(count);
  }
}
