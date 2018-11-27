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
        }
    }
    public int partition(int[]arr,int left, int right)
    {
        int pivot = arr[right];
        int i = (left-1);
        int temp = 0;
        for(int j = left;j<right;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i+1];
        arr[i+1] = arr[right];
        arr[right] = temp;
        return (i+1);
    }
    public void merge(int[]arr,int left, int mid, int[]temp)
    {

    }
}
