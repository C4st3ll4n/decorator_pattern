public class Mozzarella extends  ToppingDecorator{

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);

        System.out.println("Adding dough");
        System.out.println("Adding Mozzarela");
    }

    @Override
    public String getDescription() {
        return tempPizza.getDescription() + ", Mozzarela";
    }

    @Override
    public double getCost() {
        return tempPizza.getCost() + 5;
    }
}
