import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        task1();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arrayOne = new int[3];
        arrayOne[0] = 1;
        arrayOne[1] = 2;
        arrayOne[2] = 3;

        float[] arrayTwo = {1.57f, 7.654f, 9.986f};

        byte[] arrayThree = {1, 3, 2, 5};
        System.out.println();

        System.out.println("Задача 2");

        //1 массив туда
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i]);
            if (i != arrayOne.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //2 массив туда
        for (int i = 0; i < arrayTwo.length; i++) {
            System.out.print(arrayTwo[i]);
            if (i != arrayTwo.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //3 массив туда
        for (int i = 0; i < arrayThree.length; i++) {
            System.out.print(arrayThree[i]);
            if (i != arrayThree.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 3");
        //1 массив сюда
        for (int i = arrayOne.length - 1; i >= 0; i--) {
            System.out.print(arrayOne[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //2 массив сюда
        for (int i = arrayTwo.length - 1; i >= 0; i--) {
            System.out.print(arrayTwo[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //3 массив сюда
        for (int i = arrayThree.length - 1; i >= 0; i--) {
            System.out.print(arrayThree[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 4");
        int[] fourthArray = {1, 2, 3};

        for (int i = 0; i < fourthArray.length; i++) {
            if (fourthArray[i] % 2 != 0) {
                fourthArray[i] = fourthArray[i] + 1;
            }
        }
        System.out.println(Arrays.toString(fourthArray));
    }
}