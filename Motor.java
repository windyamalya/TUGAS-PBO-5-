public class Motor extends Datapenitip{
    private int id;
    private String jenis;
    private String warna;

    @Override
    public void setId(int id){
        this.id=id;
    }
    @Override
    public int getId(){
        return id;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    public String getJenis() {
        return jenis;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getWarna() {
        return warna;
    }
}
