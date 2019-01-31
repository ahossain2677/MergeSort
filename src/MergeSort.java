public class MergeSort {

    public void mergeSort(int[] arr )
    {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr, 0 , n-1, temp);
    }

    public void MergeSortHelper(int[] arr, int left, int right, int[] temp)
    {
        if(left < right)
        {
            int mid = (left + right)/2;
            mergeSortHelper(ar, left,mid, temp);
            mergeSortHelper(arr, mid+1 , right, temp);
            merge(arr, left, mid, right, temp);
        }

    }

}
