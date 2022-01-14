import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Batalhao implements Iterable<Oficial>{
    private List<Oficial> oficiais = new ArrayList<Oficial>();

    public Batalhao(Oficial... oficiais) {
        this.oficiais = Arrays.asList(oficiais);
    }

    @Override
    public Iterator<Oficial> iterator() {
        return oficiais.iterator();
    }
}