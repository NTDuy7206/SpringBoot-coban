package nguyentrongduy.com.dto;

import jakarta.validation.constraints.*;
import nguyentrongduy.com.entity.TaskStatus;
import java.time.LocalDate;

public class TaskRequest {
    @NotBlank(message = "Tiêu đề không được để trống")
    private String title;
    private String description;

    @NotNull(message = "Trạng thái không được để trống")
    private TaskStatus status;

    @Min(value = 1, message = "Priority phải từ 1 đến 5")
    @Max(value = 5, message = "Priority phải từ 1 đến 5")
    private int priority;

    @FutureOrPresent(message = "Hạn chót không được nhỏ hơn ngày hiện tại")
    private LocalDate deadline;

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public TaskStatus getStatus() { return status; }
    public void setStatus(TaskStatus status) { this.status = status; }

    public int getPriority() { return priority; }
    public void setPriority(int priority) { this.priority = priority; }

    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }
}