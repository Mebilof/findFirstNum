public class Training {

    public static void main(String[] args) {
        System.out.println("First missing symbol in array 5, 0, 1, 3, 2 is " + findLostNum(new int[]{5 ,0 ,1, 3, 2}));
        System.out.println("First missing symbol in array 5, 0, 1, 3, 2 is " + findLostNum(new int[]{7, 9, 10, 11, 12}));
    }

    private static int findLostNum(int[] array) {
        Arrays.sort(array); //firstly sort array
        int min = array[0]; //get min num of array
        for (int i = 0; i < array.length; i++, min++) { //we are forced to introduce a new variable for iteration, because min number may be not 0
            if (min != array[i]) {
                return min;
            }
        }
        return 0; //return 0 if array length = 1 or array contains all numbers in order
    }
}
