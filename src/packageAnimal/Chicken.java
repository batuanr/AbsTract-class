package packageAnimal;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "Chicken: clusadfsdfdsdsfsd";
    }

    @Override
    public String howToEat() {
        return "Chicken: cluck";
    }
}
