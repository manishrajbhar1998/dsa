class ChangeSetToUnset{

    public static void main(String[] args){

        int n = 26;
        int i = 2;

        if((n & (1 << i)) == 0){

        }else{
            n = (n ^ (1 << i));
        }

        System.out.println(n);
    }
}