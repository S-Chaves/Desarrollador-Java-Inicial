package Clase5;

import java.util.Scanner;

public class Clase_5_1 {
    public static void main(String[] args) {
        int arr[] = new int[3];
        String orden;

        if (args.length > 0) {
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(args[i]);
            }
            orden = args[3];
        } else {
            Scanner scn = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                System.out.print("Ingrese un número para ordenar: ");
                arr[i] = scn.nextInt();
            }

            System.out.print("Ingrese el orden: ");
            orden = scn.next();
        }

        arr = ordenar(arr, orden.charAt(0));
        System.out.print("Array ordenado: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    private static int[] ordenar(int[] arr, char orden) {
        int len = arr.length;
        int temp;

        if (orden == 'A') {
            for (int i = 0; i < len - 1; i++) {
                for (int j = 1; j < len; j++) {
                    if (arr[j - 1] > arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } else if (orden == 'D') {
            for (int i = 0; i < len - 1; i++) {
                for (int j = 1; j < len; j++) {
                    if (arr[j - 1] < arr[j]) {
                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } else {
            System.out.println("El orden debe ser A: Ascendente o D: Descendente.");
        }

        return arr;
    }
}
