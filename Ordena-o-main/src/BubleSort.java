public class BubleSort {
    public static void bubleSortInterativo(int[] array) {
        boolean troca = true;
        int tamanho = array.length;
        
        while (troca) {
            troca = false;
            
            for (int i = 0; i < tamanho - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    troca = true;
                    
                }

            }
        }
    }

    public static void bubleSortInterativoLeftRigth(int[] array, int LeftIndex, int RigthIndex) {
        boolean troca = true;
        while (troca) {
            troca = false;
            for (int i = LeftIndex; i < RigthIndex ; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    troca = true;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void bubleSortGenericos(T[] array) {
        boolean troca = true;
        int tamanho = array.length;
        while (troca) {
            troca = false;
            for (int i = 0; i < tamanho - 1 ; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    troca = true;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void bubleSortGenericoLeftRight(T[] array, int LeftIndex, int RigthIndex) {
        boolean troca = true;
        while(troca) {
            troca = false;
            for (int i = LeftIndex; i < RigthIndex; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    troca = true;

                }
            }
        }
    }
     
}
