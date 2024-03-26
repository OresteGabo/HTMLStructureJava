import java.util.ArrayList;

public abstract class LeafElement extends Tag {

    boolean closingTagRequired;
    LeafElement(String abbrev){
        super.abbrev=abbrev;
        attributes=new ArrayList<>();
    }
    @Override
    abstract String toHtml() ;

    @Override
    abstract String description() ;
}

