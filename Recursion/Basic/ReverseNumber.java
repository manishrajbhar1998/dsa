public class ReverseNumber {

    static int sum = 0;
    public static void resolve(int n){

        if(n == 0){
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        resolve(n/10);
    }

    
    public static void main(String[] args) {
        
        int n = 12345;
        resolve(n);
        System.out.print("ans :: "+sum);
    }
}
