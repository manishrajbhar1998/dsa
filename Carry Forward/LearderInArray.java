class LearderInArray {

  public static void main(String[] args) {
    // int[] nums = { 4, 2, 3, 9, 7, 10 };
    int[] nums = { 16, 17, 4, 3, 5, 2 };

    // optimise way 1
    // int ans = 1, max = nums[0], count = 1;
    // for (int i = 1; i < nums.length; i++) {
    //   if (nums[i] > max) {
    //     count++;
    //     max = nums[i];
    //   }
    // }
    // System.out.println("count: " + count);

    // optimise way 2
    int ans = 1, max = nums[nums.length - 1], count = 1;
    for (int i = nums.length - 2; i >= 0; i--) {
      if (nums[i] > max) {
        count++;
        max = nums[i];
      }
    }

    System.out.println("count: " + count);
  }
}
