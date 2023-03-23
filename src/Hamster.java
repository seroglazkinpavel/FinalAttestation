import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hamster extends Pet{
    String cage; 

    public Hamster(String id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate, thoroughbred);
        orders();
    }

    public static void Comands(){
        System.out.println("Это животное выполняет команды" + orders());
    }

    public static List<String> orders() {
        List<String> comands = new ArrayList<>();
        comands.add("Спать");
        return comands;
    }
    public static void regist() {
        System.out.println("Выберите новою команду: ");
        Scanner in = new Scanner(System.in);
        String comand = in.nextLine();
        List<String> comands = orders();
        comands.add(comand);
        System.out.println("Команда \"" + comand + "\" зарегистрирована!");
        System.out.println("Список команд.");
        for (int j = 0; j < comands.size(); j++) {
            System.out.println(comands.get(j));
        }
    }
}
