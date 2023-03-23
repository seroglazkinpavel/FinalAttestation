import java.util.Scanner;

public class Presenter {

    private Farm<Animal> animalFarm; // Связь с моделью
    private View view;
    private Animal animalinformation;

    public Presenter(Farm<Animal> animalFarm, View view) {
        this.animalFarm = animalFarm;
        this.view = view;
        animalinformation = new Animal(null, null, null);
    }

    public Farm<Animal> isRegist(String newid, String newname, String newbirthdate) {
        animalinformation.setId(newid);
        animalinformation.setName(newname);
        animalinformation.setBirthdate(newbirthdate);
        this.animalFarm.regist(animalinformation);
        return this.animalFarm;
    }

    public static void ButtonClick() {
        // System.out.print("\033[H\033[J");//
        // ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        Farm<Animal> animalFarm = new Farm<>();
        View view = new Activity();
        Presenter presenter = new Presenter(animalFarm, view);

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                String choice = view.choice();
                switch (choice) {
                    // Регистрация
                    case "1":
                        String newid = view.getNewId();
                        String newname = view.getNewName();
                        String newbirthdate = view.getNewBirthdate();
                        animalFarm = presenter.isRegist(newid, newname, newbirthdate);
                        System.exit(0);
                        break;
                    // Выход
                    case "3":
                        view.comands();
                        System.exit(0);
                        break;
                    case "4":
                        view.newComands();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Неверный ввод, пожалуйста, введите заново");
                        break;
                }
            }
        }
    }
}
