public class Cars{
	String model;
	int maxSpeed;
	String engine;
	String color;
	double avgCons;
	int price;
public void carMod(){
	System.out.println(model+" "+color+" "+engine);
}
public void carSpec(){
	System.out.println(model+" "+engine+" "+maxSpeed+" km/h "+avgCons+" l/100km "+ "Color: "+color);
}
public void expo(){
	System.out.println(" Car is at expo room");
}
public static void main(String [] args){
Cars merc=new Cars();
	merc.model="Mercedes S Classe";
	merc.color="Black-Metallic";
	merc.engine="petrol";
	merc.carMod();
Cars toy= new Cars();
    toy.model="Toyota Prius";
    toy.engine="Hybrid";
    toy.maxSpeed=183;
    toy.avgCons= 4.3;
    toy.color="White-Pearl";
    toy.carSpec();
Cars vw= new Cars();
    vw.model="VW Golf";
    vw.color="Red";
    vw.engine="Diesel";
    vw.carMod();
    vw.expo();

}}