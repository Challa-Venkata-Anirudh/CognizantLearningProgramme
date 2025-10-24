class Task {
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "TaskID: " + taskId + ", Name: " + taskName + ", Status: " + status;
    }
}

class TaskNode {
    Task task;
    TaskNode next;

    public TaskNode(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManagementSystem {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Task added.");
    }

    public Task searchTask(int id) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.taskId == id) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void deleteTask(int id) {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task deleted.");
            return;
        }

        TaskNode prev = null, current = head;
        while (current != null && current.task.taskId != id) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            prev.next = current.next;
            System.out.println("Task deleted.");
        }
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
        } else {
            TaskNode current = head;
            System.out.println("Task List:");
            while (current != null) {
                System.out.println(current.task);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        tms.addTask(new Task(1, "Design database schema", "Pending"));
        tms.addTask(new Task(2, "Implement login module", "In Progress"));
        tms.addTask(new Task(3, "Test payment gateway", "Pending"));

        tms.displayTasks();

        System.out.println("\nSearching for task with ID 2:");
        Task found = tms.searchTask(2);
        System.out.println(found != null ? found : "Task not found.");

        System.out.println("\nDeleting task with ID 1:");
        tms.deleteTask(1);

        tms.displayTasks();
    }
}
