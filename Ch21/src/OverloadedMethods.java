

public class OverloadedMethods {
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.println("Array integerArray contains: ");
        printArray(integerArray);
        System.out.println("Array doubleArray contains: ");
        printArray(doubleArray);
        System.out.println("Array characterArray contains: ");
        printArray(characterArray);
    }

    public static void printArray(Integer[] integerArray) {
        for (Integer element : integerArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void printArray(Double[] doubleArray) {
        for (Double element : doubleArray) {
            System.out.printf("%s ", element);
        }
        System.out.println("");
    }

    public static void printArray(Character[] characterArray) {
        for (Character element : characterArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    /*public static void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }*/
}
