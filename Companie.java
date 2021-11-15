package test;

import java.util.ArrayList;

public class Companie implements Element{
    protected ArrayList<Element> elements;

    public Companie() {
        this.elements = new ArrayList<Element>();
    }

    public void add(Element element)
    {
        elements.add(element);
    }

    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stud
        if (elements != null) {
            for (Element i: elements)
                i.accept(visitor);
        }
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        if (elements != null) {
            for (Element i: elements)
                i.print();
        }
    }

}
