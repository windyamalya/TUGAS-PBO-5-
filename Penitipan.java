public class Penitipan extends Datapenitip{
    public Datapenitip anggota;
    public Motor mt;
    public Petugas pt;

    void Penitipan (Datapenitip member, Motor motortitipan, Petugas petugaspenitip){
        anggota=member;
        mt=motortitipan;
        pt=petugaspenitip;
    }

    void lihatdataPenitipan(){
        System.out.println("DATA PENITIPAN MOTOR");
        System.out.println("ID COSTUMER: "+anggota.getId());
        System.out.println("NAMA COSTUMER: "+anggota.getNama());
        System.out.println("ALAMAT COSTUMER: "+anggota.getAlamat());
        System.out.println("ID MOTOR : "+mt.getId());
        System.out.println("JENIS MOTOR : "+mt.getJenis());
        System.out.println("WARNA MOTOR : "+mt.getWarna());
        System.out.println("ID PETUGAS : "+pt.getId());
        System.out.println("NAMA PETUGAS : "+pt.getNama());
    }
}
