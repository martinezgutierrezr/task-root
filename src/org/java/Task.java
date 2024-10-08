package src.org.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Comparator;

/**
 * The class Task
 * 
 * This class is designed for catch the task of the
 * users.
 */
public class Task implements Comparable<Object>{
    /**
     * The task have this characteristics.
     */
    private String title;
    private String description;
    private LocalDate dateExpiration;
    private LocalTime hourExpiration;
    private LocalDate dateCreation;
    private LocalTime hourCreation;
    private int id;
    private boolean completed;
    private static int count = 0;
    /**
     * The taskList
     * 
     * The list where the task is. It must not be in anyone. If
     * is it the case, the default is "Tasks"
     */
    private TaskList taskList; 

    /**
     * Default builder
     */
    public Task() {
        this("Unknown title", "Unknown description", null, null, TaskManager.getDefaultTaskList());
    }

    /**
     * Builder with title.
     * @param title The title of the task.
     */
    public Task(String title){
        this(title, "Unknown description", null, null, TaskManager.getDefaultTaskList());
    }

    /**
     * Builder with title and description.
     * @param title The title of the task.
     * @param description   The description of the task.
     */
    public Task(String title, String description) {
        this(title, description, null, null, TaskManager.getDefaultTaskList());
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
        this(title, description, dateExpiration, LocalTime.of(23, 59), TaskManager.getDefaultTaskList());    
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
        this(title, description, LocalDate.now(), hourExpiration, TaskManager.getDefaultTaskList());
    }

    /**
     * Builder including dateExpiration and hourExpirationLocalTime.
     * @param title The title of the task.
     * @param description   The description of the task.
     * @param dateExpiration    The expiration date of the task.
     * @param hourExpiration    The expiraiton time of the task.
     */
    public Task(String title, String description, LocalDate dateExpiration, LocalTime hourExpiration) {
        this(title, description, dateExpiration, hourExpiration, TaskManager.getDefaultTaskList());
    }

     /**
     * Builder including dateExpiration and hourExpirationLocalTime.
     * @param title The title of the task.
     * @param description   The description of the task.
     * @param dateExpiration    The expiration date of the task.
     * @param hourExpiration    The expiraiton time of the task.
     */
    public Task(String title, String description, LocalDate dateExpiration, LocalTime hourExpiration, TaskList taskList) {
        this.title = title;
        this.description = description;
        this.dateExpiration = dateExpiration;
        this.hourExpiration = hourExpiration;
        this.completed = false;
        this.dateCreation = LocalDate.now();
        this.hourCreation = LocalTime.now();
        this.taskList = taskList;
        this.id = count;
        
        taskList.addTask(this); // add the task to the taskList (make good the relationship)
        count++;
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
        return this.id;
    }

    public void setTaskRef(int taskRef) {
        this.id = taskRef;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public LocalDate getDateCreation() {
        return this.dateCreation;
    }

    public LocalTime getHourCreation() {
        return this.hourCreation;
    }

    public TaskList geTaskList() {
        return taskList;
    }

    public void setTaskList(TaskList taskList) {
        if(!this.taskList.equals(taskList)) {
            
            this.taskList = taskList;
            
        } 
    }

    /**
     * Comparation vanilla, by the creation date or time
     */
    @Override
    public int compareTo(Object o) {
        Comparator<Task> comparator = new ComparatorTaskRef();
        Task other = (Task) o;
        return comparator.compare(this, other);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) {
            return true;
        } 
        if(!(o instanceof TaskList)){
            return false;
        }
        Task other = (Task) o;
        return this.id == other.id;
    }


}



