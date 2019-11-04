public class ShellSort {
    int[] values;
    public void sort(){
        for(int gap= values.length/2; gap > 0 ; gap = (gap == 2 ? 1: (int)(gap/2.2))){
            for(int i = gap ; i < values.length; i++){
                int j = i;
                int cmpItem = values[j];
                for( ; j >= gap && cmpItem < values[j-gap]; j -= gap){
                    values[j] = values[j-gap];
                }
                values[j] = cmpItem;
            }
        }
    }

    public void print(){
        for (int i=0; i < values.length; i++){
            System.out.print(values[i]+" ");
        }
        System.out.println();
    }

    public void swap(int src, int dst){
        int tmp = values[src];
        values[src] = values[dst];
        values[dst] = tmp;
    }
    
    public static void main(String[] args) {
        ShellSort ss = new ShellSort();
        int aa[] = {9,8,6,7,3,4,5,2,1,0};
        ss.values = aa;
        ss.sort();
        ss.print();
    }   
}