package sorting.selection;

import java.util.Arrays;

public class Implementation {

  public static void main(String[] args) {

    // int[] arr = { 1, 7, 4, 8, 5, 12, 65, 92, 20 };

    // for(int i=0;i<arr.length-1;i++){
    //   int index = i;
    //   for(int j=i+1;j<arr.length;j++){
    //       if(arr[j] < arr[index]){
    //         index = j;
    //       }
    //   }

    //   int temp = arr[i];
    //   arr[i] = arr[index];
    //   arr[index] = temp;
    // }

    // System.out.println(Arrays.toString(arr));

    char[] char_arr = {'B','C','D','E','F','T','Z','K','A'};

    for(int i=0;i<char_arr.length-1;i++){
      int index = i;
      for(int j=i+1;j<char_arr.length;j++){
          if(char_arr[j] < char_arr[index]){
            index = j;
          }
      }

      char temp = char_arr[i];
      char_arr[i] = char_arr[index];
      char_arr[index] = temp;

    }

    System.out.println(Arrays.toString(char_arr));
  }

}
