/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nightstay3;

/**
 *
 * @author Turgut Reiss
 */
public class Room {
    private RTemplate[] R = new RTemplate[9];
    private int jumlahkamar = 9;
    
    
    //initialize room buat di MAIN class nanti kalau baru nyala aplikasi ok
    public void InitializeRoom(){
        
        RJunior A101 = new RJunior("101");
        R[0] = A101;
        RJunior A102 = new RJunior("102");
        R[1] = A102;
        RJunior A103 = new RJunior("103");
        R[2] = A103;
        
        
        RPresident P201 = new RPresident("201");
        R[3] = P201;
        RPresident P202 = new RPresident("202");
        R[4] = P202;
        RPresident P203 = new RPresident("203");
        R[5] = P203;
        
        
        RRoyal R301 = new RRoyal("301");
        R[6] = R301;
        RRoyal R302 = new RRoyal("302");
        R[7] = R302;
        RRoyal R303 = new RRoyal("303");
        R[8] = R303;
        
    };
    
    public void getStat(int id){
   
        if (R[id].getStatus() == true) {
            System.out.println("Occupied");
        } else {
            System.out.println("Available");
        }
    };
    
    public void book(String id, int durasi){
        switch (id) {
            case "A101": 
                if (R[0].getStatus() == false) {
                    R[0].order(durasi);
                } else {
                    System.out.println("Already Booked");
                }
                break;
            case "A102":
                if (R[1].getStatus() == false) {
                    R[1].order(durasi);
                } else {
                    System.out.println("Already Booked");
                }
                break;
            case "A103":
                if (R[2].getStatus() == false) {
                    R[2].order(durasi);
                } else {
                    System.out.println("Already Booked");
                }
                break;
            case "P101":
                if (R[3].getStatus() == false) {
                    R[3].order(durasi);
                } else {
                    System.out.println("Already Booked");
                }
                break;
            case "P102":
                if (R[4].getStatus() == false) {
                    R[4].order(durasi);
                } else {
                    System.out.println("Already Booked");
                }
                break;
            case "P103":
                if (R[5].getStatus() == false) {
                    R[5].order(durasi);
                } else {
                    System.out.println("Already Booked");
                }
                break;
            case "R101":
                if (R[6].getStatus() == false) {
                    R[6].order(durasi);
                } else {
                    System.out.println("Already Booked");
                }
                break;
            case "R102":
                if (R[7].getStatus() == false) {
                    R[7].order(durasi);
                } else {
                    System.out.println("Already Booked");
                }
                break;
            case "R103":
                if (R[8].getStatus() == false) {
                    R[8].order(durasi);
                } else {
                    System.out.println("Already Booked");
                }
                break;

        };
        
    };
    
    public void displayAllRoom(){
        for (int i = 0; i<jumlahkamar; i++){
            System.out.println("\n" + R[i].displaydescription());
        }
    
    };
}
