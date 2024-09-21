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
    }

    public void addTask(Task task){
        this.list.add(task);
    }

}
