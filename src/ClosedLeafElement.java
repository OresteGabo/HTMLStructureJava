import java.util.ArrayList;

public class ClosedLeafElement extends LeafElement{
    String content;
    ClosedLeafElement(String abbrev,String content) {
        super(abbrev);
        this.content=content;
    }

    @Override
    String toHtml() {
        StringBuilder str=new StringBuilder();
        str.append("<").append(abbrev);
        for(Attribute attribute:attributes){
            str.append(attribute.toHtml());
        }
        return String.format(">%s</%s>\n",content,abbrev);
    }

    @Override
    String description() {
        return String.format("This is a closed element %s with \"%s\"content ",abbrev,content);
    }
}
