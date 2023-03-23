
import java.util.ArrayList;
import java.util.List;

public class Farm<T> {
    private List<Animal> animals;
    public Farm() {
        animals = new ArrayList();

        animals.add(new Cat("1009", "Мася", "2009-12-12", true));
        animals.add(new Donkey("1019", "Джек", "2019-01-12", 17));
        animals.add(new Camel("1091", "Горбун", "2016-07-15", 25));
        animals.add(new Dog("1209", "Байкал", "2018-07-15", false));
    }


    /*
     * Получение списка животных
     */
    public  void printAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }

    /*
     * Добавление нового животного
     */
    public void regist(Animal animalinformation) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.contains(animalinformation)) {
                System.out.println("Такие данные уже есть.");
                System.exit(i);
            } else {
                animals.add(animalinformation);
                System.out.println("Регистрация прошла успешно " + animalinformation.getName() + "!");
                System.out.println("Список животных.");
                printAnimals();
                System.exit(i);
            }
        }

    }
}
