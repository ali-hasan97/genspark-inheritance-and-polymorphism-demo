public class Cat extends Animal{

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    public void printColor() {
        System.out.println("I have had no color described");
    }

    public void printColor(String color) {
        System.out.println("My color is " + color);
    }
}
