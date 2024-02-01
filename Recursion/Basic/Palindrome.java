public class Palindrome {

    static boolean flag = true;
    public static void resolve(String str,int s,int e){

        if(s > e){
            return;
        }
        if(str.charAt(s) != str.charAt(e)){
            flag = false;
        }
        resolve(str, ++s, --e);
    }
    
    public static void main(String[] agrs){

        String str = "abcba";
        int l = str.length()-1;
        resolve(str,0,l);
        System.out.println(flag);

        // boolean flag = true;
        // for(int i=0;i<= l/2;i++){
        //     if(str.charAt(i) != str.charAt(l-i)){
        //         System.out.println("Not a palindrome");
        //         flag = false;
        //         break;
        //     }
        // }

        // if(flag == true){
        //     System.out.println("a palindrome");

        // }


    }
}
