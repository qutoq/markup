package markup;

import java.util.List;

public class Emphasis extends Abstract implements Ficha {

    public Emphasis(List<Ficha> list) {
        super(list);
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        super.toMarkdown(sb, "*", "*");
    }

    @Override
    public void toBBCode(StringBuilder sb) {
        super.toBBCode(sb, "[i]", "[/i]");
    }
}