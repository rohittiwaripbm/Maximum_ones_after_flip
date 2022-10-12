import java.util.Scanner;

public class Flipbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int arr_size = sc.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("Enter Elements in array");
        for (int i = 0; i < arr_size; i++) {
            arr[i] = sc.nextInt();
        }

        int ZeroesCounter =0, OnesCounter =0, Max =0;
        for (int i = 0; i < arr_size; i++) {
            if (arr[i] == 0)
            {
                ZeroesCounter++;
            }
            else
            {
                ZeroesCounter--;
                OnesCounter++;
            }
            if (ZeroesCounter>Max) Max=ZeroesCounter;
            if (ZeroesCounter<0) ZeroesCounter =0;
        }
//        System.out.println(Max);
//        System.out.println(OnesCounter);
        System.out.println("Maximum number of Ones after flip: " + (OnesCounter+Max));
    }
}
