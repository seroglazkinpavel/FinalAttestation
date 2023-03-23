import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Donkey extends Beast {

    public Donkey(String id, String name, String birthdate, int loadCapacity) {
        super(id, name, birthdate, loadCapacity);
        orders();
    }
    
    public static void Comands(){
        System.out.println("Выполняемые команды животного" + orders());
    }

    public static List<String> orders() {
        List<String> comands = new ArrayList<>();
        comands.add("Пошел!");
        comands.add("Стой!");
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
