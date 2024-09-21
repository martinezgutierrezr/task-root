package src.org.java;
import java.util.ArrayList;


/**
 * The class TaskList
 * 
 * This class represents the list of task user can do.
 */
public class TaskList {
    private String name;
    private Color color;
    private ArrayList<Task> list;
    private int count = 0;

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
        count++;
    }

}
