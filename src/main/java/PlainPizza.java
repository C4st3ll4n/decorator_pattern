public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Massa";
    }

    @Override
    public double getCost() {
        return 15.00;
    }
}
