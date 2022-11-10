package markup;

import java.util.List;

public class Strong extends Abstract implements Ficha {

    public Strong(List<Ficha> list) {
        super(list);
    }

    @Override
    public void toMarkdown(StringBuilder sb) {
        super.toMarkdown(sb, "__", "__");
    }

    @Override
    public void toBBCode(StringBuilder sb) {super.toBBCode(sb, "[b]", "[/b]");
    }
}