import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pet extends Animal implements Playable {
    boolean thoroughbred;
    protected List <String> comands;


    public Pet(String id, String name, String birthdate, boolean thoroughbred) {
        super(id, name, birthdate);
        this.thoroughbred = thoroughbred;

        comands = new ArrayList<>();
    }

    public boolean getThoroughbred() {
        return thoroughbred;
    }

    public void setThoroughbred(boolean thoroughbred) {
        this.thoroughbred = thoroughbred;
    }

    @Override
    public void play() {

    }


    @Override
    public String toString() {
        return String.format("id: %d\nName: %s\nРожден: %s\nПородистый: %s\n", getId(), getName(), getBirthdate(),
                this.thoroughbred);
    }

    /*public static String regist() {
        System.out.println("Выберите новою команду: ");
        Scanner in = new Scanner(System.in);
        String comand = in.nextLine();
        //comands.add(comand);
        //System.out.println("Команда \"" + comand + "\" зарегистрирована!");
        /*for (int i = 0; i < comands.size(); i++) {

            System.out.println("Список команд.");
            for (int j = 0; j < comands.size(); j++) {
                System.out.println(comands.get(j));
            }
            System.exit(0);
        }
        return comand;
    }*/
}