
class UniqueEleRepThris{

    public static void main(String[] agrs){

        int[] arr = {4,5,5,6,4,6,5,8,4,6};

        int ans = 0;

        for(int i=0;i<32;i++){
            int count = 0;

            for(int j=0;j<arr.length;j++){

                if((arr[j] & (1 << i)) > 0) count++;
            }

            if(count % 3 != 0){
                ans = ans | (1 << i);
            }
        }

        System.out.println("Unique Ele :: "+ans);
    }
}