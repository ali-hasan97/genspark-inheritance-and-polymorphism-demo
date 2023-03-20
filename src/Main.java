public class Main {
    public static void main(String[] args) {
        // animal created from Animal superclass
        Animal animal = new Animal();

        // cat created from cat subclass
        Cat cat = new Cat();

        // subclasses inherit superclass properties and methods
        // Cat subclass health property and getter/setter inherited from Animal superclass
        cat.setHealth(5);
        cat.getHealth();

        // method overridden
        animal.speak();
        cat.speak();

        // method overloaded
        cat.printColor();
        cat.printColor("Grey");
    }
}