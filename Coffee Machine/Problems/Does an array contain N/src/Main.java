import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int [] array = new int[number];
        boolean result = false;
        for (int i = 0; i < number; i++) {
            int element = scanner.nextInt();
            array[i] = element;
        }
        int searchElement = scanner.nextInt();
        for (int j = 0; j < array.length; j++) {
            if (array[j] == searchElement) {
                result = true;
            }
        }
        System.out.println(result);
    }
}