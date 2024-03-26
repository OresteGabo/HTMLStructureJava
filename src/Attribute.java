import java.util.HashSet;
import java.util.Set;

public class Attribute {
    private final String name;
    Set<String> values;
    public Attribute(String name){
        this.name=name;
        values=new HashSet<String>();
    }
    public void add(String value){
        values.add(value);
    }
    public void remove(String value){
        values.remove(value);
    }
    public String toHtml(){
        StringBuilder builder=new StringBuilder();
        builder.append(String.format(" %s = \"",name));
        for(String value:values){
            builder.append(" ").append(value);
        }
        builder.append("\"");
        return builder.toString();
    }

}
