public class DivisiableBy7 {
  
  public static void main(String[] args) {
      String numStr = "1000";
      int num = 7;

      long result = 0;

      for(int i=0;i<numStr.length();i++){
        System.out.println(numStr.charAt(i) +" "+result);
        result = result * 10 + Character.getNumericValue(numStr.charAt(i));
        result %= num;
      }

      if(result == 0){
        System.out.println("Yes it is divisiable by "+numStr+" : "+num);
      }else{
        System.out.println("No it is no divisiable by "+numStr+" : "+num);
      }
  }
}
 