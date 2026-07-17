package nguyentrongduy.com.service;

import nguyentrongduy.com.dto.TaskRequest;
import nguyentrongduy.com.entity.Task;
import java.util.List;

public interface TaskService {
    Task createTask(TaskRequest request);
    List<Task> getAllTasks();
    Task getTaskById(Long id);
    Task updateTask(Long id, TaskRequest request);
    void deleteTask(Long id);
}