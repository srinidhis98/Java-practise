

public class Sort {
    public int[] bubbleSort(final int[] arr) {
        int temp = 0;
        final int len = arr.length;
        int i;
        int j;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len - 1; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // for(i=0; i<len; i++){
        //     System.out.print(arr[i]+ " ");
        // }
        // System.out.println();
        return arr;
    }
    public int[] selectionSort(final int[] arr) {
        int i, j;
        int minIdx;
        int temp;
        final int len = arr.length;
        System.out.println(len);
        for (i = 0; i < len - 1; i++) {
            minIdx = i;
            for (j = i + 1; j < len; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }

            }
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }
    public void mergeSort(final int[] arr, final int l, final int r) {
        
        if (l < r) {
            final int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        
    }

    public void merge(final int [] arr, final int l, final int m, final int r){
        final int n1 = m-l+1 ;
        final int n2 = r-m;
        int i,j;
        final int [] L = new int[n1];
        final int [] R = new int[n2];

         for ( i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for ( j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
        i=0;
        j=0;
        int k = l;
        while(i<n1 && j<n2){
            if(L[i]< R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = R[j];
            j++;
            k++;
        }
        for(i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    

    public static void main(final String[] args) {
        final int[] arr = { 23, 5, 6, 1, 0, 999 };
        // final Sort obj = new Sort();
        // final int[] sortedArray = obj.selectionSort(arr);
        // for (int i=0 ;i<sortedArray.length; i++) {
        //     System.out.print(sortedArray[i]+ " ");
        // }
        final Sort obj1 = new Sort();
        obj1.mergeSort(arr, 0, 5);
        
    }
}