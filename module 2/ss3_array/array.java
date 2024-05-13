import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //c1
        int[] number = {2,34,4,5,2};
        String[] text1 = {"linh", "long"};

        //c2
        int[] array = new int[5]; //có tối đa 10 phần tử

        array[0] = 1 ;
        array[1] =2 ;
        array[2] =3 ;
        array[3] =4 ;
        array[4] =5 ;

        int[] newArray = new int[array.length - 1 ];
        // index , size = length
//        int n = array.length;
//        for (int j : array){
//            System.out.println(j);
        int index = 3 ;
        for (int i = 0 ; i < array.length ; i ++ ){
            if(i < index ){
                newArray[i] = array[i] ;

            }else {
                if (i ==array.length -1){
                    break;
                }
                newArray[i]= array[i+ 1 ];
            }
        }
        array = newArray;
        System.out.println(Arrays.toString(array));



//        int[] newArray1 = new int[array.length - 1 ];

        int min = 1 ;
        int max = 3 ;
        int acountRemoveItem = max - min + 1 ;
        int[] newArray2 = new int [array.length -  acountRemoveItem];
        for (int i = 0 ; i < array.length ; i ++ ){
            if (i < min || i > max ){
                newArray[i] = array[i] ;
            }else {
                break;
            }


        }
        array = newArray;
        System.out.println(Arrays.toString(array));

    }


}
