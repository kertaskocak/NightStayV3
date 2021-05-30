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
public class RoomJuniorSuite extends Roomtemplate{
    private double harga = 15.0;
    private double total = 0;
    private int hari;
    private String roomid;
    private boolean status = false;
    
    public RoomJuniorSuite(String id){
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
    public String displaydescription(){
        String res;
        if (status != true) {
            res = ("Status: Available");
        } else {
            res = ("Status: Booked");
        }
        return ("Nomor Kamar: " + roomid
                + "\no Tipe Kamar: Junior Suite"
                + "\no Pricing: " + harga + " /malam"
                + "\n" + res);
    }
}
