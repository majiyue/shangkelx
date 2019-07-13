package gof.behaviour.visitor;

public class Client {
    public static void main(String[] args) {
        Element[] items = new Element[]{
                new Book(20, "abcdf"),
                new Book(40, "mjyada"),
                new Fruit(10, 2, "Apple"),
                new Fruit(30, 4, "PineApple")

        };

        int total = calculatePrice(items);
        System.out.println("Total prices="+total);


    }

    private static int calculatePrice(Element[] elements) {
        Visitor cart = new ShoppingCar();
        int sum = 0;
        for (Element element :
                elements) {
            sum += element.accept(cart);

        }
        return sum;
    }
}
