import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDo> toDoList;

    public ToDoList(){
        toDoList = new ArrayList<>();

    }

    public void addToDo(String item, String dueDate){
        ToDo newItem = new ToDo(item, dueDate);
        toDoList.add(newItem);
    }
}
