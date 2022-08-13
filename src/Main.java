import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    // private static TodoFunction myTodo = new TodoFunction();
    private static DefinationMain mainfun = new DefinationMain();

    public static void main(String[] args) {

        int command = 0;

        mainfun.printCommand();

        boolean exit = false;

        while (!exit) {
            System.out.println("Enter a command/choice ");
            command = sc.nextInt();
            sc.nextLine();

            switch (command) {
                case 0:
                    mainfun.printCommand();
                    break;
                case 1:
                    mainfun.printIteam();
                    break;
                case 2:
                    mainfun.addItem();
                    break;
                case 3:
                    mainfun.updateItem();
                    break;
                case 4:
                    mainfun.removeItem();
                    break;
                case 5:
                    mainfun.searchItem();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Please pick only from given command");
            }

        }

    }

}
