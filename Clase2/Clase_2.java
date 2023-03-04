public class Clase_2 {

    public static void main(String[] args) {
        // 1.
        // a.
        String str = "Este es el string de prueba";
        char ch = 'r';

        System.out.println("Cantidad de " + ch + ": " + contarChar(str, ch));
        // b.
        int num1 = 50;
        int num2 = 3;
        int num3 = 7;
        String orden = "DESC"; // ASC o DESC

        int arr[] = ordenar3Num(num1, num2, num3, orden);

        System.out.print("Array ordenado: ");
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        // c.
        int numeros[] = {3, 70, 8, 4, 12};
        int numFiltro = 6;

        System.out.println("Suma de mayores a " + numFiltro + ": " + sumarMayores(numeros, numFiltro));

        // 2.
        String str2 = "string de prueba para desplazar";
        System.out.println("String desplazado: " + desplazarStr(str2));
    }

    static int contarChar(String str, char ch) {
        int cant = 0;
        int len = str.length();

        for (int i = 0; i < len; i++)
            if (str.charAt(i) == ch)
                cant++;

        return cant;
    }

    static int[] ordenar3Num(int num1, int num2, int num3, String orden) {
        int ordenados[] = new int [3];

        int min = 0;
        int med = 1;
        int max = 2;

        if (orden.equals("DESC")) {
            min = 2; max = 0;
        }

        if (num1 < num2 && num1 < num3) {
            ordenados[min] = num1;

            if (num2 < num3) {
                ordenados[med] = num2;
                ordenados[max] = num3;
            } else {
                ordenados[med] = num3;
                ordenados[max] = num2;
            }
        } else if (num2 < num1 && num2 < num3) {
            ordenados[min] = num2;

            if (num1 < num3) {
                ordenados[med] = num1;
                ordenados[max] = num3;
            } else {
                ordenados[med] = num3;
                ordenados[max] = num1;
            }
        } else {
            ordenados[min] = num3;

            if (num1 < num2) {
                ordenados[med] = num1;
                ordenados[max] = num2;
            } else {
                ordenados[med] = num2;
                ordenados[max] = num1;
            }
        }

        return ordenados;
    }

    static int sumarMayores(int[] nums, int filtro) {
        int sum = 0;
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            if (nums[i] > filtro) {
                sum += nums[i];
            }
        }

        return sum;
    }

    static String desplazarStr(String str) {
        String abecedario = "abcdefghijklmnopqrstuvwxyz ";
        String desplazado = "";
        int len = str.length();

        for (int i = 0; i < len; i++) {
            int charIndex = abecedario.indexOf(str.charAt(i));
            if (charIndex > 24) charIndex -= 27;

            desplazado += abecedario.charAt(charIndex + 2);
        }

        return desplazado;
    }
}
