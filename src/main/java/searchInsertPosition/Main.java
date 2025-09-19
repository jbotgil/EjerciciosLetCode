package searchInsertPosition;

public class Main {
    /*
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.

    Example 1:
    Input: nums = [1,3,5,6], target = 5
    Output: 2

    Example 2:
    Input: nums = [1,3,5,6], target = 2
    Output: 1

    Example 3:
    Input: nums = [1,3,5,6], target = 7
    Output: 4
    */

    //Forma lenta
    /*public int searchInsert(int[] nums, int target) {
        boolean indiceEncontrado = false;
        int indice = 0;

        if (target==0){
            return 0;
        }

        for (int i = 0; i < nums.length && !indiceEncontrado; i++) {
            if (nums[i]==target){
                indice = i;
                indiceEncontrado = true;
            }
            if (nums.length-1 == i && !indiceEncontrado){
                i=0;
                target--;
            }
        }
        return indice;
    }*/

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.searchInsert(new int[]{1,3,5,6},5));
    }
}
