class MinMax {

  public static void main(String[] args) {
    int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
    int min, max;

    min = max = nums[0]; 

    for (int number : nums) {
      if (number < min) {
        min = number;
      }
      if (number > max) {
        max = number;
      }
    }
    System.out.println("min and max: " + min + " " + max);
  }
}
