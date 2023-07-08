public class Main {
    public static void main(String[] args) {

        int [] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println( Util.binarySearch(arr, 10));
        System.out.println( Util.binarySearch(arr, 50));
        System.out.println( Util.binarySearch(arr, 90));
        System.out.println( Util.binarySearch(arr, 100));
        System.out.println( Util.binarySearch(arr, 25));
        System.out.println( Util.binarySearch(arr, -12));

        System.out.println();

        System.out.println( Util.binarySearch(arr, 0, arr.length-1, 10));
        System.out.println( Util.binarySearch(arr, 0, arr.length-1, 50));
        System.out.println( Util.binarySearch(arr, 0, arr.length-1,90));
        System.out.println( Util.binarySearch(arr, 0, arr.length-1,100));
        System.out.println( Util.binarySearch(arr, 0, arr.length-1,25));
        System.out.println( Util.binarySearch(arr, 0, arr.length-1,-12));


    }
}
