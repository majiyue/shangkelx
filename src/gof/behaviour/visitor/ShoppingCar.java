package gof.behaviour.visitor;

import com.sun.source.tree.IfTree;

public class ShoppingCar implements Visitor {


    @Override
    public int visit(Book book) {

        int cost = book.getPrice();
        cost = cost > 50 ? cost - 5 : cost;
        System.out.println("book ISbn::" + book.getIsbn() + " cost::" + book.getPrice());

        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPrice() + fruit.getWeight();
        System.out.println(fruit.getName() + "cost::" + cost);
        return cost;
    }

}
