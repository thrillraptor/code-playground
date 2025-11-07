import java.util.Scanner;

public class problem10Queue {
    private int frontIndex; // Points to the front (oldest) element
    private int itemCount; // Number of elements currently in the queue
    private int[] queueArray;

    // Constructor
    public problem10Queue(int capacity) {
        this.frontIndex = 0;
        this.itemCount = 0;
        this.queueArray = new int[capacity];
    }

    // Enqueue operation: Add an item to the queue
    public void enqueue(int value) {
        if (itemCount == queueArray.length) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }

        int rearIndex = (frontIndex + itemCount) % queueArray.length;
        queueArray[rearIndex] = value;
        itemCount++;
        System.out.println(value + " added to the queue.");
    }

    // Dequeue operation: Remove an item from the queue
    public void dequeue() {
        if (itemCount == 0) {
            System.out.println("Queue Underflow! No item to remove.");
            return;
        }

        int removedValue = queueArray[frontIndex];
        queueArray[frontIndex] = 0; // Clear slot for clarity
        frontIndex = (frontIndex + 1) % queueArray.length;
        itemCount--;

        System.out.println(removedValue + " removed from the queue.");
    }

    // Peek operation: Show the item at the front without removing it
    public void peek() {
        if (itemCount == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println("Front element: " + queueArray[frontIndex]);
    }

    // Print operation: Display all items in logical order
    public void printQueue() {
        if (itemCount == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < itemCount; i++) {
            int index = (frontIndex + i) % queueArray.length;
            System.out.print(queueArray[index] + " ");
        }
        System.out.println();
    }

    // Debug operation: Show internal structure with front/rear markers
    public void debug() {
        System.out.println("Queue Internal State:");

        for (int i = 0; i < queueArray.length; i++) {
            System.out.printf("  [%d] %d", i, queueArray[i]);

            if (itemCount > 0) {
                if (i == frontIndex) {
                    System.out.print(" <-- Front");
                }
                if (i == (frontIndex + itemCount - 1) % queueArray.length) {
                    System.out.print(" <-- Rear");
                }
            }

            System.out.println();
        }

        if (itemCount == 0) {
            System.out.println("(Queue is empty)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter capacity of circular queue: ");
        int capacity = scanner.nextInt();

        problem10Queue queue = new problem10Queue(capacity);

        int choice;
        do {
            System.out.println("\n--- Circular Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Print Queue");
            System.out.println("5. Debug");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    queue.dequeue();
                    break;

                case 3:
                    queue.peek();
                    break;

                case 4:
                    queue.printQueue();
                    break;

                case 5:
                    queue.debug();
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
