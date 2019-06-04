public class HomeAppliance{
	String type;
	String model;
	char econClass;

	public void cooling(){
          System.out.println("Device is cooling");
    }
    public void heating(){
    	   System.out.println("Device is heating");
    }
    public void mixing(){
    	System.out.println("Device is mixing");
    }
    public static void main (String [] args){
         HomeAppliance hm1= new HomeAppliance();
    	 hm1.type= " Fridge";
    	 hm1.model=" Samsung FT-11";
    	 hm1.econClass= 'A';
    	 System.out.print(" "+ hm1.type +"  "+ hm1.model+" "+ hm1.econClass +"  ");
    	 hm1.cooling();
         HomeAppliance hm2= new HomeAppliance();
    	 hm2.type= " Bread Making Machine";
    	 hm2.model=" Moulinex GRT-233";
    	 hm2.econClass= 'B';
    	 System.out.print(" "+ hm2.type +"  "+ hm2.model+" "+hm2.econClass +"  ");
    	 hm1.mixing();
    	 HomeAppliance hm3= new HomeAppliance();
    	 hm3.type= " Stove";
    	 hm3.model=" Hansa FS-111";
    	 hm3.econClass= hm1.econClass;
    	 System.out.print(" "+ hm3.type +"  "+ hm3.model+" "+hm3.econClass +"  ");
    	 hm1.heating();
    }
}
