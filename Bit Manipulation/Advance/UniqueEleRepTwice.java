class UniqueEleRepTwice{

    public static void main(String[] agrs){

        int[] arr = {2,3,3,2,5,5,100,4,4,6,6};
        int ans = 0;

        for(int i=0;i<32;i++){

            int count = 0;

            for(int j=0;j<arr.length;j++){

                if((arr[j] & (1 << i)) > 0) count++;
            }

            if((count & 1) == 1) ans = ans | (1 <<i);
        }

        System.out.println("Unique Ele is :: "+ans);
    }
}

// TC O(32 * n)
// SC O(1)