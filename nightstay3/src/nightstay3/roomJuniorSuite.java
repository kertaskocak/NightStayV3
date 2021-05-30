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
public class roomJuniorSuite implements roomtemplate{
    private double harga = 15.0;
    private double total = 0;
    private int hari;
    private String roomid;
    private boolean status = false;
    
    public roomJuniorSuite(String id){
        roomid = id;
    }
    
    @Override
    public void order(int h){
        hari = h;
        total = harga * hari;
        status = true;
    }

    
    @Override
    public double getharga(){
        return harga;
    }
    
    @Override
    public double getTotal(){
        return total;
    }
    
    @Override
    public void displaydescription(){
        System.out.println("Nomor Kamar: " + roomid);
        System.out.println("Tipe Kamar: Junior Suite");
        System.out.println("Pricing: " + harga + " /malam");
        if (status != true){
            System.out.println("Status: Available");
        } else {
            System.out.println("Status: Booked");
        }
    }
}
