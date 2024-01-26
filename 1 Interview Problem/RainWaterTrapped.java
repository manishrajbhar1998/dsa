class RainWaterTrapped{

    public static void main(String[] args){

        int[] buildingHeights = {4,2,5,7,4,2,3,6,8,2,3};

        int n = buildingHeights.length;

        int[] prefixMax = new int[n];
        int[] suffixMax = new int[n];

        // create prefixMax Array
        prefixMax[0] = buildingHeights[0];
        for(int i=1;i<n;i++){
            if(buildingHeights[i] > prefixMax[i-1]){
                prefixMax[i] = buildingHeights[i];
            }else{
                prefixMax[i] = prefixMax[i-1];
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(prefixMax[i]+" ");
        }
        System.out.println();

        // create suffixMax Array
        suffixMax[n-1] = buildingHeights[n-1];
        for(int i=n-2;i>=0;i--){
            if(buildingHeights[i] > suffixMax[i+1]){
                suffixMax[i] = buildingHeights[i];
            }else{
                suffixMax[i] = suffixMax[i+1];
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(suffixMax[i]+" ");
        }
        System.out.println();

        // finally find trapped water
        // current buildHeight - min of (suffixMax and PrefixMax)
        int totalWaterTrapped = 0;
        for(int i=0;i<n;i++){

            int midHieght = Math.min(suffixMax[i],prefixMax[i]);

            totalWaterTrapped += midHieght - buildingHeights[i];
        }

        System.out.println(totalWaterTrapped);
    }
}