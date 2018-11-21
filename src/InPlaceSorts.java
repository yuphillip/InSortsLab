public class InPlaceSorts {
    private int[] temp;
    private int[] list1;

    public void mergeSort(int[]arr)
    {
        temp = arr;
        mergeSortHelper();
    }
    public void mergeSortHelper()
    {

    }
    public static void insertionSort(int [] list1)
    {

    }
    public static void selectionSort(double [] list1)
    {

    }
    public static void bubbleSort(String [] list1)
    {
        boolean order = false;
        String temp = "";
        while(order == false)
        {
            for(int i = 0;i<list1.length;i++)
            {
                if(list1[i].compareTo(list1[i+1])>0)
                {
                    list1[i] = temp;
                    list1[i] = list1[i+1];
                    list1[i+1] = temp;
                }
            }
            for(int)
        }
    }
}
