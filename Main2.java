/**
 * Интерфейс Animal, представляющий животное.
 */
interface Animal {
    String getBreed(); // Возвращает породу животного
    String getName(); // Возвращает имя животного
    Double getCost(); // Возвращает стоимость животного
    String getCharacter(); // Возвращает характер животного
}

/**
 * Абстрактный класс AbstractAnimal, реализующий интерфейс Animal.
 */
abstract class AbstractAnimal implements Animal {
    protected String breed; // порода
    protected String name; // имя
    protected Double cost; // цена в магазине
    protected String character; // характер

    // Конструктор
    public AbstractAnimal(String breed, String name, Double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    // Реализация методов интерфейса
    public String getBreed() { return breed; }
    public String getName() { return name; }
    public Double getCost() { return cost; }
    public String getCharacter() { return character; }
}

/**
 * Класс CreateAnimalService для создания животных.
 */
class CreateAnimalService {
    public void createUniqueAnimals() {
        int count = 0;
        while (count < 10) {
            // Логика создания уникального животного
            // Пример: new Dog("Бульдог", "Рекс", 500.0, "Дружелюбный");
            System.out.println("Создано уникальное животное: " + count);
            count++;
        }
    }
}

/**
 * Класс CreateAnimalServiceImpl для реализации методов создания животных.
 */
class CreateAnimalServiceImpl extends CreateAnimalService {
    public void createAnimals(int n) {
        for (int i = 0; i < n; i++) {
            // Логика создания животного
            System.out.println("Создано животное: " + i);
        }
    }

    public void createAnimalsDoWhile(int n) {
        int count = 0;
        do {
            // Логика создания животного
            System.out.println("Создано животное (do-while): " + count);
            count++;
        } while (count < n);
    }
}

/**
 * Главный класс Main для запуска программы.
 */
public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl service = new CreateAnimalServiceImpl();

        // Вызов методов создания животных
        service.createUniqueAnimals();
        service.createAnimals(5);
        service.createAnimalsDoWhile(3);
    }
}
