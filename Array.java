public class Array {

	public static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(--num);
        }
    }
    public static int fibonacci (final int num) {
        if (num == 1 || num == 2) {
            return num - 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static void createArray() {
        final int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void insertArray(final int[] arr, final int num, final int loc) {
        arr[loc] = num;
        System.out.println(arr[loc]);
    }

    public static void traverseArray(final int[] arr) {
        final int len = arr.length;
        for (int i =0 ; i<len;i++){
            System.out.println(arr[i]);
        }
    }
    public static void accessArray(final int [] arr, final int pos){
        final int len = arr.length;
        if (pos > len){
            System.out.println("No element found");
        }
        else{
            System.out.println(arr[pos]);
        }
    }

    public static void searchArray(int [] arr, int num){
        int len = arr.length;
        for (int i = 0; i<len;i++){
            if(arr[i] == num){
                System.out.println("Element found");
                break;
            }
            else{
                continue;
            }
        }
    }

    public static void deleteArray(int [] arr, int num){
        int len = arr.length;
        for (int i = 0; i<len;i++){
            if(arr[i] == num){
                arr[i] = -1;
                break;
            }
            else{
                continue;
            }
        }
    }


    public static void create2D(){
        int [][] arr = new int[2][2];
        arr[0][1]= 1;
        arr[1][1]= 2;
        arr[1][0]= 3;
        arr[1][1]= 4;
        
    }

    public static void insert2D(int [][] arr, int row, int col, int num){
        arr[row][col] = num;
        System.out.println(arr[row][col]);
    }

    public static void traverse2D(int [][] arr){
        for(int i =0 ;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void access2D(int[][]arr, int num){
        for(int i =0 ;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]== num){
                    System.out.println("element found");
                    break;
                }
                else{
                    continue;
                }
            }
           
        }
    }
    
    public static void main(final String[] args) {
        int [] [] arr = new int [3][3];
        // System.out.println(factorial(5));
        // System.out.println(fibonacci(10));
        // final int[] arr = {10,20,30,40};
        // createArray();
        // insertArray(arr, 10, 3);
        // traverseArray(arr);
        // accessArray(arr, 10);
        // searchArray(arr, 7);
        // deleteArray(arr, 10);
        // traverseArray(arr);
        insert2D(arr, 2, 1, 4);
        traverse2D(arr);
        access2D(arr, 4);
    }

}