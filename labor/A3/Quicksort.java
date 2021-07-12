public class Quicksort  {
    public static void main(String []args){ 
        
        int[] array = {5, 10, -5, 20, 3, 9, 12};

        for (int i = 0; i < array.length; i++){
             System.out.print(array[i] + " ");
        }
        System.out.print("\n");
        
        Quicksort sorter = new Quicksort();
        sorter.sort(array);

        for (int i = 0; i < array.length; i++){
             System.out.print(array[i] + " ");
        }
    }



    private int[] numbers;
    private int index;

    public void sort(int[] values) {
        // Prüfung auf leeres oder Null-Array
        if (values ==null || values.length==0){
            return;
        }
        this.numbers = values;
        index = values.length;
        quicksort(0, index - 1);
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        // Das Stützelement aus der Mitte der Liste holen
        int pivot = numbers[low + (high-low)/2];

        // In zwei Listen aufteilen
        while (i <= j) {
            // Wenn der aktuelle Wert aus der linken Liste kleiner ist als das Stützelement, 
            // dann hole das nächste Element aus der linken Liste
            while (numbers[i] < pivot) {
                i++;
            }
            // Wenn der aktuelle Wert aus der rechten Liste größer ist als das Stützelement, 
            // dann hole das nächste Element aus der rechten Liste
            while (numbers[j] > pivot) {
                j--;
            }

            // Wenn wir in der linken Liste einen Wert gefunden haben, der größer ist als 
            // das Stützelement und wenn wir in der rechten Liste einen Wert gefunden haben, 
            // der kleiner ist als das Stützelement, dann tauschen wir die Werte aus. 
            // Wenn wir fertig sind, können wir i und j erhöhen
            if (i <= j) {
                exchange(i, j);
                i++;
                j--;
            }
        }
        // Rekursion
        if (low < j)
            quicksort(low, j);
        if (i < high)
            quicksort(i, high);
    }

    private void exchange(int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}