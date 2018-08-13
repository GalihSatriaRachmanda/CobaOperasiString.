package js11;

import java.util.Locale;

public class CobaOperasiString {
    public static void main(String[] args){
        String identitas = "Galih Satria Rachmanda/X RPL 2/16";
        System.out.println("Identitas: "+identitas);
        
        String x ="Operasi";
        System.out.println("isi variabel x : "+x);
        System.out.println("\""+x+"\"Panjang Karakter = "+x.length());
        
        System.out.println("x adalah kosong : "+x.isEmpty());
        
        String  y =""; 
        System.out.println("Isi variabel y : "+y.length());
        System.out.println("y sama dengan kosong : "+y.isEmpty());
        
    }
}