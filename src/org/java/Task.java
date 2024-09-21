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

    /**
     * Default builder
     */
    public Task() {
        this("Unknown title", "Unknown description", null, null);
    }

    /**
     * Builder with title
     * @param title The title of the task
     */
    public Task(String title){
        this(title, "Unknown description", null, null);
    }

    /**
     * Builder with title and description
     * @param title
     * @param description
     */
    public Task(String title, String description) {
        this(title, description, null, null);
    }

    /**
     * Builder with title, description and dateExpiration
     * 
     * If there is a dateExpiration without an hourExpiration, the system should
     * assign the last minute of the day.
     * @param title
     * @param description
     * @param dateExpiration
     */
    public Task(String title, String description, LocalDate dateExpiration){
        this(title, description, dateExpiration, LocalTime.of(23, 59));    
    }
    /**
     * Builder including dateExpiration and hourExpirationLocalTime
     * @param title
     * @param description
     * @param dateExpiration
     * @param hourExpirationLocalTime
     */
    public Task(String title, String description, LocalDate dateExpiration, LocalTime hourExpiration){
        
    }

}
