public class PizzaMaker {
    public static void main(String[] args) {
        Pizza chessePizza = new Mozzarella(new TomatoSauce(new Mozzarella(new PlainPizza())));

        System.out.println("Ingredients:"+chessePizza.getDescription());
        System.out.println("Price: "+ chessePizza.getCost());
    }
}
