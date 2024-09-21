package src.org.java;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * The class Task
 * 
 * This class is designed for catch the task of the
 * users.
 */
public class Task {
    /**
     * The task have this characteristics.
     */
    private String title;
    private String description;
    private LocalDate dateExpiration;
    private LocalTime hourExpiration;
    private int taskRef;
    private boolean completed;

    /**
     * Default builder
     */
    public Task() {
        this("Unknown title", "Unknown description", null, null);
    }

    /**
     * Builder with title.
     * @param title The title of the task.
     */
    public Task(String title){
        this(title, "Unknown description", null, null);
    }

    /**
     * Builder with title and description.
     * @param title The title of the task.
     * @param description   The description of the task.
     */
    public Task(String title, String description) {
        this(title, description, null, null);
    }

    /**
     * Builder with title, description and dateExpiration.
     * 
     * If there is a dateExpiration without an hourExpiration, the system should
     * assign the last minute of the day.
     * @param title title The title of the task.
     * @param description   The description of the task.
     * @param dateExpiration The expiration date of the task.
     */
    public Task(String title, String description, LocalDate dateExpiration){
        this(title, description, dateExpiration, LocalTime.of(23, 59));    
    }

     /**
     * Builder with title, description and dateExpiration.
     * 
     * If there is an hourExpiration without a dateExpiration, the system should
     * assign the day of the creation of the task.
     * @param title title The title of the task.
     * @param description   The description of the task.
     * @param hourExpiration The expiration time of the task.
     */
    public Task(String title, String description, LocalTime hourExpiration){
        this(title, description, LocalDate.now(), hourExpiration);
    }

    /**
     * Builder including dateExpiration and hourExpirationLocalTime.
     * @param title The title of the task.
     * @param description   The description of the task.
     * @param dateExpiration    The expiration date of the task.
     * @param hourExpiration    The expiraiton time of the task.
     */
    public Task(String title, String description, LocalDate dateExpiration, LocalTime hourExpiration) {
        this.title = title;
        this.description = description;
        this.dateExpiration = dateExpiration;
        this.hourExpiration = hourExpiration;
        this.completed = false;
        this.taskRef = taskRef;
        taskRef++;
    }

    
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
   
    public LocalDate getDateExpiration() {
        return this.dateExpiration;
    }

    public void setDateExpiration(LocalDate dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
   
    public LocalTime getHourExpiration() {
        return this.hourExpiration;
    }

    public void setHourExpiration(LocalTime hourExpiration) {
        this.hourExpiration = hourExpiration;
    }
 
    public int getTaskRef() {
        return this.taskRef;
    }

    public void setTaskRef(int taskRef) {
        this.taskRef = taskRef;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }



}
