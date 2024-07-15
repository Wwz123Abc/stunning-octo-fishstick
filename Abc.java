public class Abc{
    public static void main(String[] args) {
        int[] arr = {6,1,2,7,9,3,4,5,10,8};
        sort(arr, 0, arr.length-1);
        print(arr);
    }
    public static void sort(int[] arr,int leftBound,int rightBound) {
        if(leftBound >= rightBound) return;
        int mid= partition(arr, leftBound, rightBound);
        sort(arr, leftBound, mid-1);
        sort(arr, mid+1, rightBound);
    }
    static int partition(int[] arr, int leftBound,int rightBound) {
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;

        while (left <= right) {
            while(left <= right && arr[left] <= pivot) left++;
            while(left <= right && arr[right] > pivot) right--;

            if (left < right) {
                swap(arr, left, right);
            }
        }
        swap(arr, left, rightBound);

        return left;
    }

    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
}