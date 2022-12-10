public class Petugas extends Datapenitip{
    protected int id;
    protected String nama;
    protected int no_hp;


    @Override
    public void setId(int id){
        this.id=id;
    }

    @Override
    public int getId() {
        return id;
    }
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public String getNama() {
        return nama;
    }
}
