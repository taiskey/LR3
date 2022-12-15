
import java.util.Scanner;
import java.util.Arrays;

public class lr1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("ВВедите длину массива: ");
        int size = input.nextInt();

        float array[] = new float[size];
        System.out.println("ВВедите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextFloat();
        }
        System.out.print("Исходный массив:");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + Arrays.toString(array));
        }

        double[] anArray = new double[size];
        double sum = 0.0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            anArray[i] = sum / (i + 1);

            System.out.println("Полученный массив" + Arrays.toString(anArray));
            }

        }
}

