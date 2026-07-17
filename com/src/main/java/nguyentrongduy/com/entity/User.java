package nguyentrongduy.com.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private String id;
    @Column(nullable = false)
    private String title;
    private String description;
    @Column(nullable = false)
    private UserEnum status;
    @Column(nullable = false)
    @Min(value=1)
    @Max(value=5)
    private int priority;
    private LocalDate deadline;
    @CreationTimestamp
    @Column(name = "create_at", nullable = false)
    private LocalDateTime createAt;

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

    public UserEnum getStatus() {
        return status;
    }

    public void setStatus(UserEnum status) {
        this.status = status;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }
}
