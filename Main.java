public class Main {
    public static void main(String[] args) {
        Datapenitip costumer = new Datapenitip();
        Motor mt = new Motor();
        Petugas pt = new Petugas();
        Penitipan titip = new Penitipan();

        costumer.setId(01);
        costumer.setNama("Windy");
        costumer.setAlamat("Solo");
        costumer.setJenis_kelamin("perempuan");
        mt.setId(43);
        mt.setJenis("Beat");
        mt.setWarna("Hitam");
        pt.setId(01);
        pt.setNama("Asep");
        System.out.println("No HP: " + pt.getHP(8123));

        titip.Penitipan(costumer,mt,pt);
        titip.lihatdataPenitipan();

    }
}