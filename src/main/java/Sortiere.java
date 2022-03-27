public class Sortiere {
    public static void main(String[] args) {
        // itterativer Ansatz
        int[] intArray = {8, 3, 5, 1, 0, 0, 17, -1};

        printArray(intArray);
        sort(intArray);
        printArray(intArray);

        // rekursiver Ansatz
        //int[] intArray2 = {8, 3, 5, 1, 0, 0, 17, -1};
        int[] intArray2 = {};

        printArray(intArray2);
        sortR(intArray2, intArray2.length);
        printArray(intArray2);
    }


    public static void sort(int[] numArray) {
        for (int i = numArray.length; i > 1; i--) {
            for (int j = 0; j < (i - 1); j++) {
                if (numArray[j] > numArray[j + 1]) {
                    // exchange Value of both variabls
                    swapArrayValue(numArray, j, j + 1);
                }
            }
        }
    }

    public static void sortR(int[] numArray, int size) {
        if (size < 2) {
        } else {
            for (int i = 0; i  < size - 1; i++) {
                if (numArray[i] > numArray[i + 1]) {
                    // exchange Value of both variabls
                    swapArrayValue(numArray, i, i + 1);
                }
            }
            sortR(numArray, size - 1);
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
