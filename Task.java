package tasktracker;

public class Task {

    private int taskId;
    private String taskTitle;
    private String status;

    public Task(int taskId, String taskTitle, String status) {
        this.taskId = taskId;
        this.taskTitle = taskTitle;
        this.status = status;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getStatus() {
        return status;
    }
}