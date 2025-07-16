public class Comparativos {

    //BubleSort Usando comparable, leftIndex e Rigth Index, e não sendo recursivo
    public static <T extends Comparable<T>> void bubleSortGenericoLeftRight(T[] array, int LeftIndex, int RightIndex) {
        boolean troca = true;
        while(troca) {
            troca = false;

            for (int i = LeftIndex; i < RightIndex; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    //BubleSort Usando comparable, leftIndex e Rigth Index, e não sendo recursivo
    public static <T extends Comparable<T>> void bubleSortGenericoLeftRightRecursivo(T[] array, int LeftIndex, int RightIndex) {
        if (LeftIndex >= RightIndex) return;

        for(int i = LeftIndex; i < RightIndex; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                T temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        bubleSortGenericoLeftRightRecursivo(array, LeftIndex, RightIndex  - 1);

    }

    //SelectionSort usando comparable, leftIndez e RigthIndez, e não sendo recursivo
    public static <T extends Comparable<T>> void selectionSortGenericoLeftRight(T[] array, int leftIndex, int RightIndex) {
        for (int i = leftIndex; i <= RightIndex; i++) {
            int min = i;
            for (int j = i + 1; j <= RightIndex; j++) {
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            T temp = array[i];
            array[i] = array[min];
            array[min] = temp;;
        }
    }

    //SelectionSort usando Comparable, leftIndex e RigthIndex, e sendo recursivo
    public static <T extends Comparable<T>> void selectionSortGenericoLeftRightRecursivo(T[] array, int leftIndex, int RightIndex) {
        if (leftIndex >= RightIndex) return;

        int min = leftIndex;
        for (int i = leftIndex + 1; i <= RightIndex; i++) {
            if (array[i].compareTo(array[min]) < 0) {
                min = i;

            }
        }
        T temp = array[leftIndex];
        array[leftIndex] = array[min];
        array[min] = temp;
    }
    
}
