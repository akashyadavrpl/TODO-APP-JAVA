import java.util.ArrayList;

public class TodoFunction {

    private ArrayList<String> TodoList = new ArrayList<>();

    public void addItem(String iteam) {
        // iteam = iteam
        TodoList.add(iteam);
    }

    public void removeItem(int index) {
        TodoList.remove(index);
    }

    public void printIteam() {
        System.out.println("Number of iteams is " + TodoList.size());

        for (int i = 0; i < TodoList.size(); i++) {
            System.out.println("Iteam at position at " + (i + 1) + " is " + TodoList.get(i));
        }
    }

    public void updateTodo(int index, String newiteam) {
        TodoList.set(index, newiteam);
        System.out.println("Updation competed at posotion " + (index + 1));
    }

    public String findItem(String searchIteam) {
        int searchIndex = TodoList.indexOf(searchIteam);

        if (searchIndex == -1) {
            return null;
        } else {
            return TodoList.get(searchIndex);
        }
    }

}
