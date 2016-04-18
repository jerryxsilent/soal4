package Laporan1.bab5;

/**
 *
 * @author JERRY
 */
public class Ruang2D {
    private static final double phi = 3.14 ;
    private static double panjang, lebar, alas, tinggi, sisiMiring, radius ;
    
    public static double kelilingSegitiga(double alas, double tinggi, double sisiMiring){
        return (alas + tinggi + sisiMiring);
    }
    
    public static double luasSegitiga(double alas, double tinggi){
        return (0.5 * alas * tinggi);
    }
    
    public static double kelilingSegiempat(double panjang, double lebar){
        return (2*(panjang+lebar));
    }
    
    public static double luasSegiempat(double panjang, double lebar){
        return panjang*lebar;
    }
    
    public static double kelilingLingkaran(double radius){
        return 2*phi*radius;
    }
    
    public static double luasLingkaran(double radius){
        return phi * radius *radius;
    }
}

