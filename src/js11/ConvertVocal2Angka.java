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
        tampilPerKata(kalimat, convert);
        tampilHasil(convert);
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
        private static void tampilPerKata(String kalimat, String convert){
            String[] arrKal = kalimat.split(" ");
            String[] arrCon = convert.split(" ");
            
            for (int i = 0; i < arrCon.length; i++) 
                System.out.println(arrKal[i]+" => "+ arrCon[i]);
        }
         private static void tampilHasil (String convert){
            System.out.println("Kalimat Alay Angka : "+convert);}
}