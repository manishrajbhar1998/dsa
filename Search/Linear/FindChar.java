package Search.Linear;

public class FindChar {
    
    public static void main(String[] agrs){

        String str = "Manish";
        System.out.println(resolve(str,'z'));
    }

    static int resolve(String str,char ch){

        if(str.length() == 0){
            return -1;
        }

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == ch){
                return i;
            }
        }

        return -1;
    }
}
