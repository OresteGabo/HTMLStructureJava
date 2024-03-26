//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClosedLeafElement li1=new ClosedLeafElement("li","Li1");
        CompositeElement ul1=new CompositeElement("ul");
        CompositeElement ul2=new CompositeElement("ul");
        ul1.add(li1);
        ul1.add(ul2);
        Attribute at1=new Attribute("class");
        ul1.addAttribute(at1);
        ul1.add(new NonClosedLeafElement("img"));
        ul1.add(new ClosedLeafElement("li","Li1"));
        ul1.add(new ClosedLeafElement("li","Li1"));
        ul1.add(new ClosedLeafElement("li","Li1"));
        ul1.add(new CompositeElement("ul"));
        ul1.add(ul2);
        //System.out.println(at1.toHtml());
        ul1.add(new NonClosedLeafElement("img"));
        ul1.add(new NonClosedLeafElement("img"));
        System.out.println(ul1.toHtml());

    }
}