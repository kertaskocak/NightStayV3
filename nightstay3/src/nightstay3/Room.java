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
    private Roomtemplate[] R = new Roomtemplate[15];
    private int jumlahkamar = 15;
    
    public void displayAllRoom(){
        for (int i = 0; i<jumlahkamar; i++){
            System.out.println("\n" + R[i].displaydescription());
        }
    
    };
}
