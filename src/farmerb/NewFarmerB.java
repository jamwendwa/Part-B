/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package farmerb;

/**
 *
 * @author Jack
 */
public class NewFarmerB {
    //private String dat;
    private FarmerB farmer;
    private String id;
    private int number;
    private int numFarmer;
    public static final int MAX_NUMBER=30;
    
    public NewFarmerB(FarmerB farmer, String id, int number){
        //this.dat=dat;
        this.farmer=farmer;
        this.id=id;
        this.number=number;
        numFarmer=0;        
}
    public NewFarmerB(FarmerB farmer, String id, int number, int numFarmer){
        //this.dat=dat;
        this.farmer=farmer;
        this.numFarmer=numFarmer;
        this.id = id;
        this.number = number;        
}
    //public String getDate(){
        //return dat;
    //}
    public FarmerB getFarmer(){
        return farmer;
    }
    public void setnumber(int number){
        this.number=number;
    }
    public String toString(){
        return farmer + " " + id + ":" + number ;
    }
    void nextFarmerB(int number){
        System.out.print(this);
        for(int i=0; i <number; ++i);
        System.out.print(number+1);
    }
    
}
