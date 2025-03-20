import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter position to insert (1-based index): ");
                    int insertPos = sc.nextInt() - 1;
                    System.out.print("Enter value to insert: ");
                    int value = sc.nextInt();
                    if (insertPos < 0 || insertPos > size) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    for (int i = size; i > insertPos; i--) {
                        arr[i] = arr[i - 1];
                    }
                    arr[insertPos] = value;
                    size++;
                    System.out.println("Element inserted successfully.");
                    break;
                case 2:
                    System.out.print("Enter position to delete (1-based index): ");
                    int deletePos = sc.nextInt() - 1;
                    if (deletePos < 0 || deletePos >= size) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    for (int i = deletePos; i < size - 1; i++) {
                        arr[i] = arr[i + 1];
                    }
                    size--;
                    System.out.println("Element deleted successfully.");
                    break;
                case 3:
                    System.out.print("Enter position to update (1-based index): ");
                    int updatePos = sc.nextInt() - 1;
                    if (updatePos < 0 || updatePos >= size) {
                        System.out.println("Invalid position!");
                        break;
                    }
                    System.out.print("Enter new value: ");
                    arr[updatePos] = sc.nextInt();
                    System.out.println("Element updated successfully.");
                    break;
                case 4:
                    System.out.println("Current array: ");
                    for (int i = 0; i < size; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;
                
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

