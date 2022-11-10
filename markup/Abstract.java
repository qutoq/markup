package markup;

import java.util.List;

public abstract class Abstract implements Element {
    private final List<? extends Element> list;

    public Abstract(List<? extends Element> list) {
        this.list = list;
    }

    public void toMarkdown(StringBuilder sb, String left, String right) {
        sb.append(left);
        for (Element el : list) { el.toMarkdown(sb); }
        sb.append(right);
    }

    public void toBBCode(StringBuilder sb, String left, String right) {
        sb.append(left);
        for (Element el : list) { el.toBBCode(sb); }
        sb.append(right);
    }

}