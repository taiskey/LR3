
import java.util.Scanner;

import java.util.Arrays;


public class lr22 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("ВВедите длину массива: ");
        int N = input.nextInt();
        int[] arr = new int[N];

        if (N >= 0) {
        } else {
            System.out.println("Размерность не может быть равна 0 или быть отрицательной.");
            return;
        }

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Введите элемент, который нужно удалить из массива:");
        int X = input.nextInt();

        System.out.println("Изначальный массив: " + Arrays.toString(arr));

        int[] newArr = new int[N];

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == X) {
                newArr = new int[arr.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    newArr[j] = arr[j+1];
                }
                break;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(newArr));
    }
}
