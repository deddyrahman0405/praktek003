/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acer
 */
public class bolaaksi {
    public static void main(String[] args) {
        bola b = new bola();
        
        
        b.setMerk("Butterfly");
        b.setUkuran("barapalah");
        b.setWarna("kuning");
        b.setHarga(200000);
        //gak bisa b.setJenisbola();
        
        b.cetakinfo();
        
        System.out.print("merknya \t: ");
        System.out.println(b.getMerk());
        System.out.print("ukurannya \t: ");
        System.out.println(b.getUkuran());
        System.out.print("warnanya \t: ");
        System.out.println(b.getWarna());
        System.out.print("harganya \t: ");
        System.out.println(b.getHarga());
        
        
        sepatubola sp = new sepatubola();
        sp.setMerk("apalah");
        sp.setUkuran("35");
        sp.setWarna("hijau");
        sp.setHarga(300000);
        sp.setJenisbola("apayo");
        sp.cetakinfo();
        System.out.println("Jenis \t:"+sp.getJenisbola());
        sp.throttle();
    }
}
