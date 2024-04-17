public class SubArraySum {

  public static void main(String[] args) {
    int[] arr = { 2, 8, -1, 4 };
    int n = arr.length;


    // brute force approach
    // for(int i=0;i<n;i++){
    //     for(int j=i;j<n;j++){
    //         int sum = 0;
    //         for(int k=i;k<=j;k++){
    //             sum += arr[k];
    //         }
    //         System.out.println(sum);
    //     }
    // }

    // using prefix sum
    
    for(int i=1;i<n;i++){
        arr[i] += arr[i-1];
    }

    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){

            if(i == 0){
                System.out.println(arr[j]);
            }else{
                System.out.println(arr[j] - arr[i-1]);

            }
        }
    }

  }
}
