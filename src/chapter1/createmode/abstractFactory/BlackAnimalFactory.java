package chapter1.createmode.abstractFactory;

public class BlackAnimalFactory  implements AnimalFactory{

    @Override
    public Cat createCat() {
        return null;
    }

    @Override
    public Dog createDog() {
        return null;
    }
}
