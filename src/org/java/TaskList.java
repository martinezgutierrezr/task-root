package src.org.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * The class TaskList
 * 
 * This class represents the list of task user can do.
 */
public class TaskList {
    private String name;
    private Color color;
    private ArrayList<Task> list;
    private int id;
    private static int count = 0;

    public TaskList() {
        this("List", Color.BLUE);
    }

    public TaskList(String name){
        this(name, Color.BLUE);
    }

    public TaskList(String name, Color color){
        this.name = name;
        this.color = color;
        this.list = new ArrayList<>();
        this.id = count;
        count++;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Task> getList() {
        return this.list;
    }

    public void setList(ArrayList<Task> list) {
        this.list = list;
        Collections.sort(this.list);
    }

    public void addTask(Task... tasks){
        for(Task task : tasks){
            this.list.add(task);
        }
        Collections.sort(this.list);    // When all the task where added, reorder it.
    }

    public void removeTask(Task... tasks) {
        for(Task task : tasks) {
            this.list.remove(task);
        }
        Collections.sort(this.list);    // When all the task where removed, reorder it.
    }

    /**
     * Method orderTaskList
     * 
     * This method is used for order the list in a determinated
     * order.
     */
    public static void orderTaskList(TaskList taskList, Comparator<Task> comparator) {
        Collections.sort(taskList.list, comparator);
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;  
        }
        if (!(obj instanceof TaskList)) {
            return false;  
        }
        TaskList other = (TaskList) obj;  
        return this.id == other.id;  
    }
    

    

}
