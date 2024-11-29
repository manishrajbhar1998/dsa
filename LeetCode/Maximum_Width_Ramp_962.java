import java.util.Stack;
public class Maximum_Width_Ramp_962 {
  
  public static void main(String[] args){

      int[] arr = {9,8,1,0,1,9,4,0,4,1};

      // BruteForce approach
      // int maxRamp = 0;
      // for(int i=0;i<arr.length-1;i++){
      //     for(int j=i+1;j<arr.length;j++){
      //       if(arr[i] <= arr[j]){
      //           int temp = j - i;
      //           maxRamp = maxRamp < temp ? temp : maxRamp;
      //       }
      //     }
      // }
      // System.out.println(maxRamp);

      Stack<Integer> st1 = new Stack<>();
     

      for(int i=0;i<arr.length;i++){
        if(st1.isEmpty() || arr[st1.peek()] > arr[i]){
          st1.push(i);
        }
      }

      int ramp = 0;

      for(int j=arr.length-1;j>=0;j--){
          while(!st1.isEmpty() && arr[st1.peek()] <= arr[j]){
              ramp = Math.max(ramp,j-st1.pop());
          }
      }

      System.out.println(ramp)  ;




  }
}
