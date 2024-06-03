import static java.util.Collections.swap;

public static void bubbleSort(int[] list){
    boolean neddNextPass = true ;
    for(int k = 1 ; k < list.length && neddNextPass ; k++){
        neddNextPass = false;
        for(int i = 0 ; i < list.length - 1 ; i++){
            if(list[i] > list[i+1]){
                swap();
            }
        }
    }
    swap();{
        int temp = list[0];
        list[0] = list[list.length - 1];
        list[list.length - 1] = temp;

    }
}

private static void swap() {

}

public void main() {
}
