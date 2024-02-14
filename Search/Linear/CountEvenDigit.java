package Search.Linear;

public class CountEvenDigit {
    
    public static void main(String[] agrs){

        int[] arr = {45,1,2,4,789,56,1235};

        System.out.println(resolve(arr));
    }

    static int resolve(int[] arr){

        int count = 0;

        for(int ele : arr){

            if(isEven(ele)){
                count++;
            }
        }

        return count;
    }

    static boolean isEven(int ele){

        int count = 0;
        while(ele != 0){
            count++;
            ele = ele / 10;
        }

        if(count % 2 == 0){
            return true;
        }else{
            return false;
        }

    }
}
