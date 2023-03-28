package baitap2;

public class BAItAP2 {
    public static void main(String[] args) {
        insertionSort();
    }
    public static void insertionSort() {
        int[] list = {5,2,8,3,9,1};
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
            list[k+1] = currentElement;
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }

}
