public class Numeros {

    public static void main(String[] args) {
        System.out.println("Os numeros primos são: ");
        int constant = 0;
        int num;
        int num1 = 120;
        for (int i = 1; i <= num1; i++) {
            num = i;
            constant = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    constant = constant + 1;
                }
            }

            if (constant == 2) {
                System.out.println(num);

            }

        }
    }
}