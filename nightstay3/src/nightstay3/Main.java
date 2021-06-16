/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightstay3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean kondisi = true;
        int x = 0;

        while (kondisi == true ){
            //display home
            System.out.println(" Welcome to Night Stay Hotel");
            System.out.println("____________________________");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("0. Exit");
            System.out.println("Pilhan anda : ");
            x = input.nextInt();

            if (x == 1){
                //display admin
                System.out.println(" Hello Admin");
                System.out.println("0. Back to Home");
                System.out.println("Username : ");
                System.out.println("Password : "); //input 1 buat lanjut
                x = input.nextInt();

                if (x == 1){
                    //display home admin 
                    System.out.println(" data semua ruangan pada hotel");
                    System.out.println(" Info harga kamar ");
                } else {
                    System.out.println("Try Again");
                }

            } else if (x == 2){
                //display user
                System.out.println(" Hello User");
                System.out.println("First Name : ");
                System.out.println("Last Name  : ");
                System.out.println("Email      : ");
                System.out.println("Gender     : ");
                System.out.println(" Apakah data sudah benar ?  tekan 1.yes/2.no ");
                x = input.nextInt();
                
                if (x == 1) {
                    //display user next 
                    System.out.println(" Tipe Kamar ");
                    System.out.println("1. Junior suite ");
                    System.out.println("2. Royal suite ");
                    System.out.println("3. president suite ");
                    System.out.println("4. Info kamar");
                    System.out.println("0. Kembali ");
                    System.out.println("Silahkan pilih jenis kamar : ");
                    System.out.println("Jumlah kamar yang dipesan  : ");
                    System.out.println("Pilihan Anda : ");
                    x = input.nextInt();

                    if (x == 1) {
                         //display check in/out
                        System.out.println(" Tanggal Check in dan Check out");
                        System.out.println("Silahkan Masukan tanggal Check in  : ");
                        System.out.println("Silahkan Masukan tanggal Check out : ");
                        System.out.println(" Apakah anda sudah yakin ? 1.yes/2.no"); //kalo no di ulang lagi pengisiannya
                        x = input.nextInt();

                        if (x == 1) {
                             //display summary 
                            System.out.println(" Summary ");
                            System.out.println("Tipe Kamar   : ");
                            System.out.println("Jumlah Kamar : ");
                            System.out.println("Check in     : ");
                            System.out.println("Check out    : ");
                            System.out.println("Total        : ");
                            System.out.println(" Apakah data yang dimasukkan sudah benar : yes/no");

                        } else if (x == 2) {
                            //repeat
                        } else {
                            System.out.println("Try Again");
                        }
            
                    } else if (x == 4) {
                            //display info kamar 
                            System.out.println(" Info Kamar");
                            System.out.println("Junior Suite ");
                            System.out.println("Penjelasan Kamar");
                            System.out.println("Royal Suite");
                            System.out.println("Penjelasa Kamar");
                            System.out.println("President suite");
                            System.out.println("Penjelasa Kamar");
                    }

                } else if (x == 2) {
                    // ulang lagi ngisinya ga tau codenya :v
                } else {
                    System.out.println(" error!!! please try again ");
                }
                
            } else if (x == 3){
                //keluar program /  selesai
                kondisi = false;

            } else {
                System.out.println("Ulangi pilihan anda !");
            }

        }
    }
}
