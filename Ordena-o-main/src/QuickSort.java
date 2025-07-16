public class QuickSort {
    public static void quickSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) { // CORRIGIDO AQUI
            int pivot = partition(array, leftIndex, rightIndex);
            quickSort(array, leftIndex, pivot - 1);
            quickSort(array, pivot + 1, rightIndex);
        }
    }

    public static int partition(int[] array, int leftIndex, int rightIndex) {
        int pivot = array[leftIndex];
        int i = leftIndex;

        for (int j = leftIndex + 1; j <= rightIndex; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        // Coloca o pivô no lugar correto
        int temp = array[leftIndex];
        array[leftIndex] = array[i];
        array[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int[] array = {9, 12, 13, 2, 1};
        quickSort(array, 0, array.length - 1);

        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
