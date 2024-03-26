import org.w3c.dom.Attr;

import java.util.ArrayList;

public abstract class Tag {
    String abbrev;
    ArrayList<Attribute> attributes;
    abstract String toHtml();
    abstract String description();
    void addAttribute(Attribute attribute){
        attributes.add(attribute);
    }
    void removeAttribute(Attribute attribute){
        attributes.remove(attribute);
    }
}
