interface Animal {
    String getBreed();
    String getName();
    Double getCost();
    String getCharacter();
}

abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;

    public AbstractAnimal(String breed, String name, Double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getCost() {
        return cost;
    }

    @Override
    public String getCharacter() {
        return character;
    }
}

class Mammal extends AbstractAnimal {
    public Mammal(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }
}

class Canine extends Mammal {
    public Canine(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }
}

class Feline extends Mammal {
    public Feline(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }
}

class Predator extends Canine {
    public Predator(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }
}

class Pet extends Canine {
    public Pet(String breed, String name, Double cost, String character) {
        super(breed, name, cost, character);
    }
}


class CreateAnimalService {
    public void createAnimals() {
        int count = 0;
        while (count < 10) {
            Animal animal = createRandomAnimal();
            System.out.println("Создано животное: " + animal.getName() + " (" + animal.getBreed() + ")");
            count++;
        }
    }

    public void createAnimals(int n) {
        for (int i = 0; i < n; i++) {
            Animal animal = createRandomAnimal();
            System.out.println("Создано животное: " + animal.getName() + " (" + animal.getBreed() + ")");
        }
    }

    public void createAnimalsDoWhile() {
        int count = 0;
        do {
            Animal animal = createRandomAnimal();
            System.out.println("Создано животное: " + animal.getName() + " (" + animal.getBreed() + ")");
            count++;
        } while (count < 10);
    }

    private Animal createRandomAnimal() {
        String[] breeds = {"German Shepherd", "Siberian Husky", "Persian", "Maine Coon", "Lion", "Tiger"};
        String[] names = {"Max", "Lucy", "Buddy", "Charlie", "Bella", "Cooper", "Daisy", "Jack", "Rocky", "Sophie", "Leo", "Rajah"};
        String[] characters = {"Friendly", "Playful", "Loyal", "Independent", "Affectionate", "Energetic", "Calm", "Protective", "Fierce", "Wild"};

        int breedIndex = (int) (Math.random() * breeds.length);
        int nameIndex = (int) (Math.random() * names.length);
        int charIndex = (int) (Math.random() * characters.length);

        double cost = 500 + Math.random() * 1500;

        // Simplified animal creation -  replace with more sophisticated logic if needed.
        if (Math.random() < 0.5) {
            return new Pet(breeds[breedIndex], names[nameIndex], cost, characters[charIndex]);
        } else {
            return new Predator(breeds[breedIndex], names[nameIndex], cost, characters[charIndex]);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        CreateAnimalService service = new CreateAnimalService();
        service.createAnimals();
        System.out.println("--------------------");
        service.createAnimals(5);
        System.out.println("--------------------");
        service.createAnimalsDoWhile();
    }
}