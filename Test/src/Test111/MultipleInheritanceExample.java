package Test111;
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming");
    }
}

class FlyingFish implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Flying fish is flying");
    }

    @Override
    public void swim() {
        System.out.println("Flying fish is swimming");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();

        Fish fish = new Fish();
        fish.swim();

        FlyingFish flyingFish = new FlyingFish();
        flyingFish.fly();
        flyingFish.swim();
    }
}
