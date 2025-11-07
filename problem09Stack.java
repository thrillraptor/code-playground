import java.util.Scanner;

public class problem09Stack {
    private int top;
    private int[] items;

    // Constructor
    problem09Stack(int n) {
        this.top = -1;
        this.items = new int[n];
    }

    // Push operation
    public void push(int value) {
        if (top == items.length - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            items[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    // Pop operation
    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow! No element to pop.");
        } else {
            int popped = items[top];
            items[top] = 0;
            top--;
            System.out.println(popped + " popped from stack.");
        }
    }

    // Peek operation
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.println("Top element is: " + items[top]);
        }
    }

    // Debug operation
    public void debug() {
        System.out.println("Debugging Stack:");

        for (int i = 0; i < this.items.length; i++) {
            System.out.printf("  [%d] %d", i, this.items[i]);
            if (i == this.top) {
                System.out.print(" <-- Top");
            }
            System.out.println();
        }

        if (this.top == -1) {
            System.out.println("(Stack is empty)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack: ");
        int n = sc.nextInt();

        problem09Stack stack = new problem09Stack(n);

        int choice;
        do {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Debug");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.debug();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        } while (choice != 5);

        sc.close();
    }
}
