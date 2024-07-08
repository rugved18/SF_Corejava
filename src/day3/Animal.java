package day3;
abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void sound();

    public void eat() {
        System.out.println(name + " is eating.");
    }

    protected String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof Woof");
    }
}