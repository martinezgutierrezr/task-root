package src.org.java;

import java.util.ArrayList;


public class TaskManager {
    private static TaskList defaultTaskList;
    private static ArrayList<TaskList> TaskLists = new ArrayList<>();

    static {
        defaultTaskList = new TaskList("Tasks", Color.BLUE);
        TaskLists.add(defaultTaskList);
    }

    public static TaskList getDefaultTaskList() {
        return defaultTaskList;
    }

    public static void addTaskList(TaskList taskList) {
        TaskLists.add(taskList);
    }

    public static ArrayList<TaskList> getTaskLists(){
        return TaskLists;
    }
}

