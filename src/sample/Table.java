package sample;

public class Table {
    private int Size;
    private int IdTable;
    private boolean TableStatus = true;

    public Table(){

    }

    public Table(int size, int idTable, boolean tableStatus) {
        Size = size;
        IdTable = idTable;
        TableStatus = tableStatus;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getIdTable() {
        return IdTable;
    }

    public void setIdTable(int idTable) {
        IdTable = idTable;
    }

    public boolean isTableStatus() {
        return TableStatus;
    }

    public void setTableStatus(boolean tableStatus) {
        TableStatus = tableStatus;
    }


    @Override
    public String toString() {
        return "sample.Table{" +
                "Size=" + Size +
                ", IdTable=" + IdTable +
                '}';
    }
}
