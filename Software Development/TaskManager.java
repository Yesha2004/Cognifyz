import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private int id;
    private String title;
    private String description;

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Task ID: " + id + ", Title: " + title + ", Description: " + description;
    }
}

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static int taskIdCounter = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nTask Manager:");
            System.out.println("1. Create a new task");
            System.out.println("2. Read tasks");
            System.out.println("3. Update a task");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createTask();
                    break;
                case 2:
                    readTasks();
                    break;
                case 3:
                    updateTask();
                    break;
                case 4:
                    deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }
    }

    private static void createTask() {
        System.out.print("Enter task title: ");
        String title = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        Task newTask = new Task(taskIdCounter++, title, description);
        tasks.add(newTask);
        System.out.println("Task created successfully!");
    }

    private static void readTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Tasks:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private static void updateTask() {
        System.out.print("Enter the ID of the task to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Task task = findTaskById(id);
        if (task != null) {
            System.out.print("Enter new task title (leave blank to keep current): ");
            String newTitle = scanner.nextLine();
            if (!newTitle.isEmpty()) {
                task.setTitle(newTitle);
            }

            System.out.print("Enter new task description (leave blank to keep current): ");
            String newDescription = scanner.nextLine();
            if (!newDescription.isEmpty()) {
                task.setDescription(newDescription);
            }

            System.out.println("Task updated successfully!");
        } else {
            System.out.println("Task not found!");
        }
    }

    private static void deleteTask() {
        System.out.print("Enter the ID of the task to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Task task = findTaskById(id);
        if (task != null) {
            tasks.remove(task);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found!");
        }
    }

    private static Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }
}
