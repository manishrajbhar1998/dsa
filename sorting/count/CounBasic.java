import java.util.*;

public class CounBasic {

  public static void main(String[] agrs) {
    // Count Short
    // This logic for 0 to 9
    // int[] A = {1,3,8,3,2,0,6,5,3,8,0}; // 1 2 3 3 3 5 6 8 8
    // int[] freq = new int[A.length];
    // for(int i=0;i<A.length;i++){
    //     int val = A[i];
    //     freq[val]++;
    // }
    // System.out.println(Arrays.toString(freq));
    // for(int i=0;i<freq.length;i++){
    //     int val = freq[i];

    //     for(int j=1;j<=val;j++){
    //         System.out.print(i+" ");
    //     }
    // }

    // Generic
    int[] A = { -3, 2, 2, 1, -4, 5, -3 }; 
    // int[] A = {10,15,20,100,1,54,20,11,12};
    int min = Arrays.stream(A).min().getAsInt();
    System.out.println(min);
    int max = Arrays.stream(A).max().getAsInt();
    System.out.println(max);

    int[] freq = new int[max - min + 1]; 

    for(int i=0;i<A.length;i++){

        int val = A[i] - min;
        freq[val]++;
    }

    System.out.println(Arrays.toString(freq));

    for(int i=min;i<=max;i++){
        int val = freq[i - min];
        for(int j=1;j<=val;j++){
            System.out.print(i+" ");
        }
    }

  }
}
