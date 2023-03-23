import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dog extends Pet{

    static boolean guard;
    boolean streetBooth;

    public Dog(String id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate, thoroughbred);

        orders();

    }
    
    public static void Comands(){
        System.out.println("Выполняемые команды животного" + orders());
    }

    public static List<String> orders() {
        List<String> comands = new ArrayList<>();
        comands.add("Лежать");
        comands.add("Сидеть");
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
