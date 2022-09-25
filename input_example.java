package tugas.pkg1.sangat.mudah.sekali;

import java.util.Scanner;

public class input_example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Membuat Objek dari Class Scanner
        String nama; //Variabel String, Untuk Menyimpan Input dari User
        System.out.print("Sangat mudah sekali : ");
        nama = input.nextLine(); //Mendapatkan Input dari User
        System.out.println("sangat mudah sekali "); //Mencetak Output
    }
}