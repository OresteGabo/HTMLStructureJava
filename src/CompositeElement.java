import java.util.ArrayList;
public class CompositeElement extends Tag{
    private final ArrayList<Tag> tags;


    public CompositeElement(String abbrev,boolean closeRequired){
        this.tags=new ArrayList<>();
        super.abbrev=abbrev;
        attributes=new ArrayList<>();
    }
    public CompositeElement(String abbrev){
        this(abbrev,false);
    }
    public void add(Tag tag){
        tags.add(tag);
    }
    public void remove(Tag tag){
        tags.remove(tag);
    }
    @Override
    public String toHtml() {

        StringBuilder str = new StringBuilder();

        str.append(String.format("<%s\n",abbrev));
        //str.append(String.format("<%s>\",abbrev));
        for(Attribute attribute:attributes){
            str.append(attribute.toHtml());
        }
        str.append(String.format(">\n",abbrev));

        for(Tag tag:tags ){
            str.append('\t');
            str.append(tag.toHtml());
            str.append('\t');
        }
        str.append(String.format("</%s>\n",abbrev));

        return str.toString();
    }
    @Override
    public String description() {
        return "composite element "+abbrev+"\n";
    }
}
