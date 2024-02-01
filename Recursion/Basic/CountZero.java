public class CountZero {

    public static int resolve(int num,int count){

        if(num == 0){
            return count;
        }

        if(num % 10 == 0){
            return resolve(num/10, ++count);
        }else{
            return resolve(num/10, count);
        }
    }
    
    public static void main(String[] agrs){

        int num = 112;
        int ans = resolve(num,0);
        System.out.println(ans);
    }
}
