/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmerb;

/**
 *
 * @author Jack
 */
public class TestNewFarmerB {
    public static void main(String[] args) {
        FarmerB farmer1 = new FarmerB("Kamau");
        FarmerB farmer2 = new FarmerB("Omolo");
        FarmerB farmer3 = new FarmerB("Hassan");
        farmer1.addFarmerId("kba", 1);
        farmer2.addFarmerId("kbb", 2);
        farmer3.addFarmerId("kbc", 3);
        System.out.printf("The next farmer will be", farmer1.nextFarmerB());
        
        // TODO code application logic here
    }
    
}

