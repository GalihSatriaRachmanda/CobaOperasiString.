package js11;

import java.util.Scanner;
public class ConvertVocal2Angka {
    private static void tampilJudul (String identitas) {
        System.out.println("IdentitaS : "+identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
        public static void main(String[] args){
        String identitas = "Galih Satria Rachmanda / X RPL 2 / 16";
        
        tampilJudul(identitas);
        String kalimat = tampilInput();
        String convert = vocal2angka(kalimat);
        }
        private static String tampilInput(){
            Scanner scanner=new Scanner(System.in);
            
            System.out.println("Masukan kalimat: ");
            String kalimat = scanner.nextLine();
            System.out.println("Kalimat asli: " + kalimat);
            
            return kalimat;
    }
        private static String vocal2angka(String kalimat){
            char [][] arConvert =
            {{'a','4'},{'1','1'},{'u','2'},{'3','3'},{'o','0'}};
            
            kalimat = kalimat.toLowerCase();
            for (int i = 0; i < arConvert.length; i++) 
                kalimat=kalimat.replace(arConvert[i][0], arConvert[i][1]);
                
                return kalimat;
        }
}