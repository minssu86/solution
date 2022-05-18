import java.util.ArrayList;

public class Solution26 {

    public static void main(String[] args) {

        int[] arr = {4,3,2,1};

        int min = arr[0];
        int minIndex = 0;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
                minIndex = i;
            }
            arrayList.add(arr[i]);
        }
        arrayList.remove(minIndex);
        arrayList.stream().mapToInt(i->i).toArray();
    }
}
