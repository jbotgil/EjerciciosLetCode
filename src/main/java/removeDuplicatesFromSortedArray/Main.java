package removeDuplicatesFromSortedArray;

public class Main {

    /*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.

    Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

    Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    Return k.
    */

    //Devuelve la longitud del array despues de eliminar los duplicados y sobreescribe el array nums con la lista actualizada
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // primer elemento siempre es único
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i]; // colocamos el nuevo único
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(main.removeDuplicates(nums));
    }
}
