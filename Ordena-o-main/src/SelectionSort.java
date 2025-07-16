public class SelectionSort {
    public static void selectionSortInterativo(int[] array) {
        int tamanho = array.length;
        for (int i = 0; i < tamanho ; i++) {
            int min = i;

            for (int j = i + 1; j < tamanho; j ++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            //swap array[i], array[min]
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }

    public static void selectionSortInterativoLeftRigth(int[] array, int LeftIndex, int RigthIndex) {
        for (int i = LeftIndex; i <= RigthIndex; i++) { //Pois preciso ir até o último, poiis se fosse apenas um < ele não pegaria o rigth index, pq o rigth index  é a posicao real do array começandod de 0 até n;
            int min = i; 
            for (int j = i + 1; j <= RigthIndex; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static <T extends Comparable<T>> void selectionSortGenerico(T[] array) {
        int tamanho = array.length;
        for (int i = 0; i < tamanho; i++ ) {
            int min = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            T temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
    }

    public static <T extends Comparable<T>> void selectionSortGenericoLeftRight(T[] array, int LeftIndex, int RightIndex) {
        for (int i = LeftIndex; i <= RightIndex; i++) {
            int min = i;
            for (int j = i + 1; j <= RightIndex; i++) {
                if (array[j].compareTo(array[min]) < 0) {
                    min = j;
                }
            }
            //swap Array[i], Array[min]
            T temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
    
}
