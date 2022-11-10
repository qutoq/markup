package markup;

import java.util.List;

public class OrderedList extends Abstract implements Part {

    public OrderedList(List<ListItem> list) {super(list);}

    @Override
    public void toBBCode(StringBuilder sb) {
        super.toBBCode(sb, "[list=1]", "[/list]");
    }

    @Override
    public void toMarkdown(StringBuilder sb) {}
}