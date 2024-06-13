import java.util.Arrays;

class RainWaterTrapped{

    public static void main(String[] args){

        int[] buildingHeights = {4,2,5,7,4,2,3,6,8,2,3};

        int n = buildingHeights.length;

        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        // create prefixMax Array
        prefixMax[0] = buildingHeights[0];
        for(int i=1;i<n;i++){
            if(prefixMax[i-1] > buildingHeights[i]){
                prefixMax[i] = prefixMax[i-1];
            }else{
                prefixMax[i] = buildingHeights[i];
            }
        }

        System.out.println(Arrays.toString(prefixMax));

        // create suffixMax Array
        suffixMax[n-1] = buildingHeights[n-1];
        for(int i=n-2;i>=0;i--){
            if(suffixMax[i+1] > buildingHeights[i] ){
                suffixMax[i] = suffixMax[i+1];
            }else{
                suffixMax[i] = buildingHeights[i];
            }
        }

       System.out.println(Arrays.toString(suffixMax));

        // finally find trapped water
        // current buildHeight - min of (suffixMax and PrefixMax)
        int totalWaterTrapped = 0;


        for(int i=0;i<n;i++){

            int leftBH = prefixMax[i];
            int rightBH = suffixMax[i];
            int minB = Math.min(leftBH,rightBH);

            totalWaterTrapped += minB - buildingHeights[i];

        }

        // for(int i=0;i<n;i++){

        //     int midHieght = Math.min(suffixMax[i],prefixMax[i]);

        //     totalWaterTrapped += midHieght - buildingHeights[i];
        // }

        System.out.println(totalWaterTrapped);
    }
}