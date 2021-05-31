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
        RRoyal R302 = new RRoyal("301");
        R[7] = R302;
        RRoyal R303 = new RRoyal("301");
        R[8] = R303;
        
    };
    
    public void displayAllRoom(){
        for (int i = 0; i<jumlahkamar; i++){
            System.out.println("\n" + R[i].displaydescription());
        }
    
    };
}
