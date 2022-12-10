public abstract class DataTitip {
    private int id;
    private String nama;
    private String alamat;
    private String jenisKelamin;
    private int noHP;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenis_kelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setNoHP(int noHP) {
        this.noHP = noHP;
    }

    abstract int getHP(int noHP);
}
