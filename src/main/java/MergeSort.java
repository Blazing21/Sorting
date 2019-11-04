class MergeSort {
    void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int Left[] = new int[n1];
        int Right[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            Left[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = arr[mid + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } 
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 90, 30, 5, 3, 15 };
        MergeSort mergedArr = new MergeSort();
        System.out.println("Merge Sorting");
        System.out.print("Data Sebelum di Sorting : ");
        for(int x = 0; x < 5; x++)
            System.out.print(arr[x]+" ");
        System.out.println("");
        mergedArr.sort(arr, 0, arr.length - 1);
        System.out.print("Data Setelah di Sorting : ");
        printArray(arr);
    }
}