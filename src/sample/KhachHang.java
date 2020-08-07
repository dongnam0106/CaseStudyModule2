package sample;

public class KhachHang {
    private int idKH;
    private String name;
    private int sdt;
    private int tableId;

    public KhachHang() {

    }

    public KhachHang(int IdKH, String name, int sdt, int tableId) {
        this.idKH = IdKH;
        this.name = name;
        this.sdt = sdt;
        this.tableId = tableId;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    @Override
    public String toString() {
        return "sample.KhachHang{" +
                "idKH=" + idKH +
                ", name='" + name + '\'' +
                ", sdt=" + sdt +
                ", tableId=" + tableId +
                '}';
    }
}
