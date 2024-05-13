import java.util.Arrays;
import java.util.Scanner;

public class array_tc {
    public static void main(String[] args) {

        // c2
        int[] array = new int[5]; // 10 so luong toi da cac phan tu
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        // xoa cac phan tu tu vi tri a->b:
        array = removeItem(1, 3, array);
        System.out.println(Arrays.toString(array));
    }

    static int[] removeItem(int a, int b, int[] arrayRemove) {
        int countItemRemove = b - a + 1;
        int[] newArray2 = new int[arrayRemove.length - countItemRemove];
        for (int i = 0; i < arrayRemove.length; i++) {
            if (i < a) {
                newArray2[i] = arrayRemove[i]; // [1,0]
            } else {
                if (i == arrayRemove.length - countItemRemove) {
                    break;
                }
                newArray2[i] = arrayRemove[i + countItemRemove];
            }
        }
        arrayRemove = newArray2;
        return arrayRemove;
    }
}
