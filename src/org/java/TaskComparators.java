package src.org.java;
import java.util.Comparator;


/**
 * Compare by the expiration date or expiration time
 */
class ComparatorDateExp implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        int result = o2.getDateExpiration().compareTo(o1.getDateExpiration());
        return (result != 0 ? result : o2.getHourExpiration().compareTo(o1.getHourExpiration()));
    }
}

/**
 * Compare by creation date or time.
 */
class ComparatorTaskRef implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        int result = o2.getDateCreation().compareTo(o1.getDateCreation()); 
        return (result != 0 ? result : o2.getHourCreation().compareTo(o1.getHourCreation()));
    }
}
