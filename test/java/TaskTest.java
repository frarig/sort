import org.junit.BeforeClass;
import org.junit.Test;

public class TaskTest {
    private static int size = 15;
    private static int[] array = new int[size];

    @BeforeClass
    public static void createArray() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    @Test
    public void arrayShouldBeSort() {
        printArray(array);

        Task.sort(array, 1, size);

        printArray(array);
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]\n");
    }
}
