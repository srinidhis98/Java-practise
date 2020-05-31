

public class Search {
    public int binarySearch(int [] arr, int l, int r, int x){
        if(l<r){
            int mid = (l+r)/2;
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid]>x){
                return binarySearch(arr, l, mid-1, x);
            }
            return binarySearch(arr, mid, r, x);

        }
        return -1;
    }


    public static void main(String [] args){
        int [] arr = {10,20,30,40,50,60,70};
        Search obj = new Search();
        int pos = obj.binarySearch(arr, 0, 6, 20);
        System.out.println("Element found in "+pos);
    }


}