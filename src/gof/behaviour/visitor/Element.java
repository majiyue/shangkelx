package gof.behaviour.visitor;

public interface Element {
    int accept(Visitor visitor);
}
