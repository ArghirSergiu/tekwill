public class Lego{
	String type;
	int numPieces;
	String themes;
 public void disp(){
    System.out.println("Setul"+themes+" este disponibil");
}
public void spec(){
	System.out.println(themes+" are "+numPieces+" piese");
}
public void byType(){
    System.out.println(" Setul"+themes+" este din"+type);
}
public static void main (String [] args){
Lego ninj=new Lego();
	ninj.themes=" Lego Ninjago";
	ninj.disp();
Lego tech=new Lego();
    tech.themes=" Lego Technic";
    tech.numPieces=324;
    tech.spec();
    tech.disp();
}
}