public class SelectionSort
{
    public static void selectionsort(int arr[])
    {
       for(int i = 0; i < arr.length - 1 ; i++)
       {
        int min = i;
        for(int j = min + 1 ;j < arr.length ;j++)
        {
            if(arr[j] < arr[min])
            {
                min = j;
            }
        }

        if(i != min)
        {
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
       }
    }
    public static void main(String args[])
    {
        int arr[] = new int [] {20,9,15,12,8};

        selectionsort(arr);

        for(int a : arr)
        {
            System.out.print(a + " ");
        }
    }
}