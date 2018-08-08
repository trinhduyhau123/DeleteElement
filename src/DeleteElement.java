import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        System.out.println("Nhập số lượng phần tử: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhập phần tử "+ i+ " :");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.printf(array[i] + "\t");
        }
        System.out.println("Nhập vị trí xóa: ");
        int vitrixoa = scanner.nextInt();
        for (int i = vitrixoa + 1; i < size; i++) {
            array[i-1] = array[i];
        }
        size--;

        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + "\t");
        }
    }
}
