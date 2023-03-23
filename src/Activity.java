
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity implements View {
    Scanner in;
    List<String> comands;
    public Activity() {

        in = new Scanner(System.in);
        this.comands =  comands;
    }

    @Override
    public String choice() {
        System.out.println("Введите цифру необходимого действия: \n" +
                "1. Завести новое животное\n" +
                //"2. Определить животное в правильный класс\n" +
                "3. Увидеть список команд, выполняемых животным\n" +
                "4. Обучить животное новым командам");
        String choice = in.nextLine();
        return choice;
    }
    @Override
    public void comands(){
        System.out.println("Выберите тип животных: \n" +
                "1. Домашние\n" +
                "2. Вьючные");
        int userSelectedClass = in.nextInt();

        switch (userSelectedClass) {
            //int userSelected;
            case 1:
                System.out.println("Выберите вид животных: \n" +
                        "1. Кошки\n" +
                        "2. Собаки\n" +
                        "3. Хомяки\n");
                int userSelected = in.nextInt();
                switch (userSelected) {
                    case 1:
                        Cat.Comands();
                        break;
                    case 2:
                        Dog.Comands();
                        break;
                    case 3:
                        Hamster.Comands();
                        break;
                }
                break;
            case 2:
                System.out.println("Выберите вид животных: \n" +
                        "1. Верблюды\n" +
                        "2. Ослы\n" +
                        "3. Лошади\n");
                userSelected = in.nextInt();
                switch (userSelected) {
                    case 1:
                        Camel.Comands();
                        break;
                    case 2:
                        Donkey.Comands();
                        break;
                    case 3:
                        Horse.Comands();
                        break;
                }
                break;
        }
    }

    @Override
    public void newComands(){
        int userSelectedClass = choosingAnAnimal ();
        switch (userSelectedClass) {
            //int userSelected;
            case 1:
                System.out.println("Выберите вид животных: \n" +
                        "1. Кошки\n" +
                        "2. Собаки\n" +
                        "3. Хомяки\n");
                int userSelected = in.nextInt();
                switch (userSelected) {
                    case 1:
                        Cat.regist();
                        break;
                    case 2:
                        Dog.regist();
                        break;
                    case 3:
                        Hamster.regist();
                        break;
                }
                break;
            case 2:
                System.out.println("Выберите вид животных: \n" +
                        "1. Верблюды\n" +
                        "2. Ослы\n" +
                        "3. Лошади\n");
                userSelected = in.nextInt();
                switch (userSelected) {
                    case 1:
                        Camel.regist();
                        break;
                    case 2:
                        Donkey.regist();
                        break;
                    case 3:
                        Horse.regist();
                        break;
                }
                break;
        }
    }

    // Выбор типа животных
    public int choosingAnAnimal () {
        System.out.println("Выберите тип животных: \n" +
                "1. Домашние\n" +
                "2. Вьючные");
        int userSelectedClass = in.nextInt();
        return userSelectedClass;
    }
    @Override
    public void selectedClass(){
        System.out.println("Выберите тип животных: \n" +
                "1. Домашние\n" +
                "2. Вьючные");
        int userSelectedClass = in.nextInt();

        switch (userSelectedClass) {

            case 1:
                getNewThoroughbred();
                break;
            case 2:
                getNewLoadCapacity();
                break;
        }
    }

    @Override
    public String getNewName() {
        System.out.println("---------- Регистрация ----------");
        System.out.println("Пожалуйста, введите имя животного");
        String newname = in.nextLine();
        return newname;
    }

    @Override
    public String getNewId() {
        System.out.println("Пожалуйста, введите id животного");
        String newid = in.nextLine();
        return newid;
    }

    @Override
    public String getNewBirthdate() {
        System.out.println("Пожалуйста, введите дату рождения животного");
        String birthdate = in.nextLine();
        return birthdate;
    }

    @Override
    public boolean getNewThoroughbred() {
        System.out.println("Пожалуйста, введите чистокровное ли животное: \n" +
                "1. Да\n" +
                "2. Нет");
        String thoroughbred = in.nextLine();
        if (thoroughbred == "1") {
            return true;
        } else return false;
    }

    @Override
    public int getNewLoadCapacity() {
        System.out.println("Пожалуйста, введите груз(число) для перевоза животным");
        int newloadCapacity = in.nextInt();
        return newloadCapacity;
    }
}
