public class Task {
    /**
     *
     * @param a initial array
     * @param p minimum array length
     * @param r array length
     */
    public static void sort(int[] a, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            sort(a, p, q);
            sort(a, q + 1, r);
            merge(a, p, q, r);
        }
    }

    /**
     * At each step, the array is divided in half
     * While there are permutations and array isn't sorted, compare the elements on the interval 'q'
     * Reduce the sorting step by 2 times
     *
     * @param a the initial array
     * @param p the minimum array length
     * @param q interval and sort step
     * @param r the array length
     */
    private static void merge(int[] a, int p, int q, int r) {
        while (q >= p) {
            for (int i = 0; i < r; i++) {
                for (int j = i - q; j >= 0; j -= q) {
                    if (a[j] > a[j + q]) {
                        swap(a, j, j + q);
                    }
                }
            }
            q /= 2;
        }
    }

    /**
     * Swaps the first element and the second
     *
     * @param a      the array
     * @param first  the first element of array
     * @param second the second element of array
     */
    private static void swap(int[] a, int first, int second) {
        int temp  = a[second];
        a[second] = a[first];
        a[first]  = temp;
    }
}
