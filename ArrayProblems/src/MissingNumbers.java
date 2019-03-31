
public class MissingNumbers {
   
	static void findMissingNumber(int[] arr) {
        int currentValue =1;
        int max=10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != currentValue) {
                for (int j = currentValue; j < max; j++) {
                    System.out.println("Missing number Found : " + j);
                }
        }
            currentValue = arr[i] + 1;
       }
    }
    public static void main(String[] args) {
      int[] arr = {1,2,10};
      findMissingNumber(arr);
   }
}
