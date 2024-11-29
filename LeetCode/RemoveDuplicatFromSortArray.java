public class RemoveDuplicatFromSortArray {
  
    public static void main(String[] args){

        int[] arr = {0,0,1,1,1,1,2,3,3};
        int[] ref = new int[arr.length];
        ref[0] = arr[0];

        int emptyCount = 0;

        int i=0;
        int j=1;
        int n = arr.length;

        int count = 1;
        while (j < n) {
          
          if(arr[j] == arr[i]){
            count++;
            
            j++;
          }else{
            count = 1;
            i = j;
            j = i+1;
          }

          if(count >= 3){
              
              emptyCount++;
          }
        }

        System.out.println(emptyCount);
    }
}
