import java.util.EmptyStackException;

public class StackTest2 {
    public static void main(String[] args) {
        // type parameters can only represent reference types
        // that is why arrays declared below is declared using
        // wrapper type classes instead of primitive types
        Double[] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
        Integer[] integerElements = {1, 2, 3, 4, 6, 7, 8, 9, 10};

        Stack<Double> doubleStack = new Stack<Double>(5);
        Stack<Integer> integerStack = new Stack<Integer>();

        testPush("doubleStack", doubleStack, doubleElements);
        testPop("doubleStack", doubleStack);

        testPush("integerStack", integerStack, integerElements);
        testPop("integerStack", integerStack);
    }

    public static <T> void testPush(String name, Stack<T> stack, T[] elements) {
        System.out.printf("\n Pushing elements onto %s\n", name);

        for (T element : elements) {
            System.out.printf("%s ", element);
            stack.push(element);
        }
    }

    public static <T> void testPop(String name, Stack<T> stack) {
        try {
            System.out.printf("\nPopping elements from %s\n", name);
            T popValue;

            while (true) {
                popValue = stack.pop();
                System.out.printf("%s ", popValue);
            }
        } catch (EmptyStackException emptyStackException) {
            emptyStackException.printStackTrace();
        }
    }
}
