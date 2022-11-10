package markup;

import java.util.List;

public class Paragraph extends Abstract implements Part {

    public Paragraph(List<Ficha> list) { super(list);}

    public void toMarkdown(StringBuilder sb) { super.toMarkdown(sb, "", "");}

    public void toBBCode(StringBuilder sb) { super.toBBCode(sb, "", "");}
}