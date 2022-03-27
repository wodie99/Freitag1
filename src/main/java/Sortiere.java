public class Sortiere {
    public static void main(String[] args) {

        int[] intArray = {8,3,5,1,0,0,17,-1};

        printArray(intArray);
        sort(intArray);
        printArray(intArray);
    }


    public static void sort(int[] numArray) {
        for (int i = numArray.length; i > 1 ; i--) {
            for (int j = 0; j < (i-1); j++) {
                if(numArray[j] > numArray[j + 1]) {
                    // exchange Value of both variabls
                    swapArrayValue(numArray, j, j+1);
                }
            }
        }
    }

    public static void swapArrayValue(int[] numArray, int field1, int field2) {
        int swap = numArray[field1];
        numArray[field1] = numArray[field2];
        numArray[field2] = swap;

    }

    public static void printArray(int[] numArray) {
            System.out.print("{ ");
        for (int i = 0; i < numArray.length; i++) {
            System.out.print(numArray[i] + ", ");
        }
        System.out.println("\b\b }");
    }
}
