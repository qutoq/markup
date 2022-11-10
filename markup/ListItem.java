package markup;

import java.util.List;

public class ListItem extends Abstract implements Part {
    public ListItem(List<Part> list) {
        super(list);
    }

    @Override
    public void toBBCode(StringBuilder sb) {
        super.toBBCode(sb, "[*]", "");
    }

    @Override
    public void toMarkdown(StringBuilder sb) {}
}