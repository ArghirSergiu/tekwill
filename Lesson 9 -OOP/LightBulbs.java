public class LightBulbs{
	String type;
	int power;
	int colorType;
  
    public void sold(){
    	System.out.println("Bulb is sold out.");
    }
    public void stock(){
    	System.out.println("Bulb is in stock.");
    }
    public void await(){
    	System.out.println("Bulb will be soon in stock.");
    }
    public static void main(String [] args){
      LightBulbs lb1= new LightBulbs();
        lb1.type="LED ";
        lb1.power= 55 ;
        lb1.colorType= 3200 ;
        System.out.print(lb1.type +" "+ lb1.power+" "+lb1.colorType+" ");
        lb1.sold();

     LightBulbs lb2=  new LightBulbs();
         lb2.type ="Halogen";
         lb2.power= lb1.power;
         lb2.colorType= 4700;
         System.out.print(lb2.type +" "+ lb2.power+" "+lb2.colorType+" ");
        lb2.stock();
     LightBulbs lb3=  new LightBulbs();
         lb3.type ="Halogen";
         lb3.power= 125;
         lb3.colorType= lb2.colorType;
         System.out.print(lb3.type +" "+ lb3.power+" "+lb3.colorType+" ");
        lb3.await();
    }
}