import sample.Table;

import java.util.ArrayList;

public class BookTable {
    public static void main(String[] args) {
        Table table = new Table();

        ArrayList<Table> tables4P = new ArrayList<Table>();
        for (int i = 1; i < 11; i++) {
            tables4P.add(new Table(4,i,true));
        }
    }

}
