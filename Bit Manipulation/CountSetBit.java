class CountSetBit{

    public static void main(String[] args){

        int n = 25;

        int count = 0;

        // way 1
        // for(int i=0;i<32;i++){

        //     if((n & (1 << i)) > 0){
        //         count++;
        //     }
        // }

        // way 2
        while(n > 0){

            if((n & 1) > 0){
                count++;
            }

            n = n >> 1;
        }

        System.out.println("count :: "+count);
    }
}