// Base class
class AnimalKingdom {
    protected String name;
    protected int age;

    public AnimalKingdom(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass representing mammals
class Mammal extends AnimalKingdom {
    private boolean hasFur;

    public Mammal(String name, int age, boolean hasFur) {
        super(name, age);
        this.hasFur = hasFur;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a mammal sound.");
    }

    public void displayMammalInfo() {
        displayInfo();
        System.out.println("Has fur: " + hasFur);
    }
}

// Subclass representing birds
class Bird extends AnimalKingdom {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " chirps.");
    }

    public void displayBirdInfo() {
        displayInfo();
        System.out.println("Can fly: " + canFly);
    }
}

// Test class
public class Animal {
    public static void main(String[] args) {
        Mammal dog = new Mammal("Dog", 4, true);
        Bird eagle = new Bird("Eagle", 3, true);

        System.out.println("Testing Mammal:");
        dog.makeSound();
        dog.displayMammalInfo();
        
        System.out.println("\nTesting Bird:");
        eagle.makeSound();
        eagle.displayBirdInfo();
    }
}
