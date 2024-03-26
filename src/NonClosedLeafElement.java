public class NonClosedLeafElement extends LeafElement{

    NonClosedLeafElement(String abbrev) {
        super(abbrev);
    }

    @Override
    String toHtml() {
        return "</"+super.abbrev+">\n";
    }

    @Override
    String description() {
        return String.format("This is an non closed %s element",abbrev);
    }
}
