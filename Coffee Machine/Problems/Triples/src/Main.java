import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int [] array = new int[number];
        int count = 0;
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        for (int j = 0; j < number - 2; j++) {
            if (array[j] + 1 == array[j + 1] && array[j + 1] + 1 == array[j + 2]) {
                count++;
            }
        }
        System.out.println(count);
    }
}