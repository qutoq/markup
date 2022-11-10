package markup;

import java.util.List;

public class UnorderedList extends Abstract implements Part {

    public UnorderedList(List<ListItem> list) { super(list);}

    @Override
    public void toBBCode(StringBuilder sb) { super.toBBCode(sb, "[list]", "[/list]");}

    @Override
    public void toMarkdown(StringBuilder sb) {}
}