public class QuickSort {
    public static void quickSort(int[] input) {
        int n=input.length;
        qsort(input,0,n-1);
    }

    public static void qsort(int input[],int s,int e) {

        if(s>=e)
            return;

        int a=input[s];

        int count=s;
        for(int i=s+1;i<=e;i++) {
            if(input[i]<=a)
                count++;
        }

        input[s]=input[count];
        input[count]=a;

        int i=s;
        int j=e;
        while(i<=count && j>=count) {
            if(input[i]<=a)
                i++;
            else {
                if(input[j]<=a) {
                    int temp=input[j];
                    input[j]=input[i];
                    input[i]=temp;
                    i++;
                    j--;
                }
                else
                    j--;
            }
        }
        qsort(input,s,count-1);
        qsort(input,count+1,e);
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = { 12, 11, 13, 5, 6 };
        System.out.println("Quick Sorting");
        System.out.print("Data Sebelum di Sorting : ");
        for(int x = 0; x < 5; x++)
            System.out.print(arr[x]+" ");
        System.out.println();
        quickSort(arr);
        System.out.print("Data Setelah di Sorting : ");
        printArray(arr);
    }
}