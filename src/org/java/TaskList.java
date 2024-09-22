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
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Task> getList() {
        return list;
    }

    public void setList(ArrayList<Task> list) {
        this.list = list;
        Collections.sort(this.list);
    }

    public void addTask(Task... tasks){
        for(Task task : tasks){
            this.list.add(task);
        }
        Collections.sort(this.list);    // When all the task where added, order it.
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

    

    

}
