public class BucketSort {
    public void bucketSort(int[] array){
        int n = maxVal(array);
        int[] bucket = new int[n + 1];
		
        for (int x = 0; x < bucket.length; x++) {
            bucket[x] = 0;
        }

        for (int y = 0; y < array.length; y++) {
            bucket[array[y]]++;
        }

        int outPos = 0;
        for (int p = 0; p < bucket.length; p++) {
            for (int q = 0; q < bucket[p]; q++) {
                array[outPos++] = p;
            }
        }
    }	
	
    private int maxVal(int[] array) {
        int max = 0;
        for (int i : array) {
            if (i > max) max = i;
        }
		
        return max;
    }

    public static void main(String[] args){
        BucketSort bs = new BucketSort();		
        int arr[] = {4, 5, 6, 2, 1};
        System.out.println("Bucket Sorting");
        System.out.print("Data Sebelum di Sorting : ");
        for(int x = 0; x < 5; x++)
        System.out.print(arr[x]+" ");
        System.out.println("");
        bs.bucketSort(arr);
        System.out.print("Data Setelah di Sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}