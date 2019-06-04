public class PieseAuto {
	String tip;
	String denum;
	int quantity;

	    public void stock(){
	    System.out.println(" Piesa este in stoc");
        }
        public void mount(){
    	System.out.println("  Piesa se instaleaza");
      	}
        public void unmount(){
    	System.out.println("  Piesa se dezinstaleaza");
        }
    	public static void main (String [] args){
    	 PieseAuto pa1= new PieseAuto();
         pa1.tip= "Suspensie";
         pa1.denum="Amortizator.";
         pa1.quantity=22;
         System.out.print(""+pa1.tip +" "+pa1.denum+"");
         pa1.mount();
         PieseAuto pa2=new PieseAuto();
         pa2.tip="Caroserie";
         pa2.denum="Aripa";
         pa2.quantity=5;
         System.out.print(""+pa2.tip +" "+pa2.denum+"  "+(pa2.quantity--)+" buc.");
         pa2.stock();
         PieseAuto pa3=new PieseAuto();
         pa3.tip="Ulei";
         pa3.denum="10w60";
         pa3.quantity=50;
         System.out.print(""+pa3.tip +" "+pa3.denum+"  "+(pa3.quantity--)+" buc.");
         pa2.stock();
         PieseAuto pa4=new PieseAuto();
         pa4.tip="Ulei Diesel";
         pa4.denum="5w40";
         pa4.quantity=30;
         System.out.print(""+pa4.tip +" "+pa4.denum+"  "+(pa4.quantity--)+" buc.");
         pa2.stock();

    }
}