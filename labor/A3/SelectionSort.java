public class SelectionSort {
    public static void main(String args[]) {
        
        if (args.length != 5){
            System.err.println("ERROR: Es muessen exakt fünf Argumente angegeben Werden!");
            return;
        }

        int[] array = { Integer.parseInt(args[0]),
                        Integer.parseInt(args[1]),
                        Integer.parseInt(args[2]),
                        Integer.parseInt(args[3]),
                        Integer.parseInt(args[4]) };

        System.out.print("Eingabe: ");
        for (int i = 0; i < array.length; i++){
             System.out.print(array[i] + " ");
        }
        
        SelectionSort sorter = new SelectionSort();
        sorter.Sort(array);

        System.out.print("\nAusgabe: ");
        for (int i = 0; i < array.length; i++){
             System.out.print(array[i] + " ");
        }
    }
    
    public void Sort(int[] data) {
        for (int i = 0; i < data.length-1; i++){
            int currMinIndex = i;
            int tmp;
            for(int j = i + 1; j < data.length; j++){
                if (data[currMinIndex] > data[j]){
                    currMinIndex = j;
                }
            }
            tmp = data[i];
            data[i] = data[currMinIndex];
            data[currMinIndex] = tmp;
        }
    }
 
}