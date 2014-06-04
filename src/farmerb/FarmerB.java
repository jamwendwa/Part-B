/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmerb;

/**
 *
 * @author Jack
 */
public class FarmerB {
    private String name;
    private String id[];
    private int number[];
    private int numFarmer;
    public static final int MAX_NUMBER=30; 
    
    public FarmerB(String name){
        this.name=name;
        id = new String[MAX_NUMBER];
        number = new int[MAX_NUMBER];
        numFarmer=0;        
}
    public String getName(){
        return name;
    }
    /*public void setid(String[] id){
        this.id=id;
    }*/
    public String toString(){
        return name;
    }
    public void addFarmerId(String ids, int numbers){
        id[numFarmer] = ids;
        number[numFarmer] = numbers;
        ++numFarmer;
    }
    public void PrintNumber(){
        System.out.print(this);
        for (int i=0; i<numFarmer; i++){
            System.out.print("  " + id[i] + ":" + number[i]);
        }
        System.out.println();
    }
    public void nextFarmerB(int number){
        for(int i=0; i <number; ++i);
        System.out.print(number+1);
    }
    

    /**
     * @param args the command line arguments
     */
    
}

