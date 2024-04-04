public class TwoUniqueEleRepTwice {
    public static void main(String[] agrd){

        int[] A = {10,8,8,9,9,11,10,17,11,20};
        int n = A.length;

        int xor = 0;

        for(int i=0;i<n;i++){
            xor = xor ^ A[i];
        }

        int pos = 0;
        for(int i=0;i<32;i++){
            if((xor & (1 << i)) > 0){
                pos = i;
                break;
            }
        }

        int set = 0, unset = 0;

        for(int i=0;i<n;i++){
            if((A[i] & (1 << pos)) > 0){
                set = set ^ A[i];
            }else{
                unset = unset ^ A[i];
            }
        }

        System.out.print(set+" "+unset);
    }
}
