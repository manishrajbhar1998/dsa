
import java.lang.*;
public class ReverseWord {
  public static void main(String[] args) {

    String str = "geeks quiz practice code";
    String[] strArr  = str.split(" ");

    int s = 0;
    int e = strArr.length-1;

    while(s < e){
      String temp = strArr[s];
      strArr[s] = strArr[e];
      strArr[e] = temp;
      s++;
      e--;
    }

    for(int i=0;i<strArr.length;i++){ 
      System.out.print(strArr[i]+" ");
    }

    

  }
}
