package gof.behaviour.visitor;

public class Book implements Element {
    private int price;
    private String isbn;

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public Book(int price, String isbn) {
        this.price = price;
        this.isbn = isbn;
    }



    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
