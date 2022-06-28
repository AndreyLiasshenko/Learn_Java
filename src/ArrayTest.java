//import java.util.Arrays;
//
public class ArrayTest {
    public static void main(String[] args) {
//        int array[][][] = new int[3][4][5];
//
//        for (int i =0; i<3; i++) {
//            for (int j =0; j<4; j++) {
//                for (int k=0; k<5; k++) {
//                    array[i][j][k] = i * j * k;
//                }
//            }
//        }
//        for (int i =0; i<3; i++) {
//            for (int j=0; j<4; j++) {
//                for (int k= 0; k<5; k++) {
//                    System.out.print(array[i][j][k] + " ");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
//}
///             ////////      Output  ///////
//  0 0 0 0 0
//  0 0 0 0 0
//  0 0 0 0 0
//  0 0 0 0 0
//
//  0 0 0 0 0
//  0 1 2 3 4
//  0 2 4 6 8
//  0 3 6 9 12
//
//  0 0 0 0 0
//  0 2 4 6 8
//  0 4 8 12 16
//  0 6 12 18 24
//
////
//    int a1[] = new int[3];
//    int[] a2 = new int[3];
//    int[] nums, nums2, nums3; // сразу 3 масива
//    int b = 160;
//    int b2 = b >> 3;
//    System.out.println(b2);
//



//    int array[] = {1, 3, 4,6,4,2,3, 54,5454,64,236,8457,543,4,84,575,534,62};
//    int find = 543;
//    for (int x : array) {
//        if (x == find) {
//            System.out.println("Yes");
//        }
//    }

        out: for (int i =0; i<30; i++) {
             for (int j =0; j<30;j++) {
                if (j > i ) {
                    System.out.println();
                    continue out;
                }
                System.out.print(" "+ (i * j));
            }
        }
        System.out.println();


    }
}