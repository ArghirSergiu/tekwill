public class Ceas{
	byte ora;
	byte min;
	byte sec;
	short an;
	byte data;
	byte luna;
	double kmParcursi;
	int pasi;
	public void afisareOra(){
		System.out.println(ora+":"+ min+":"+  sec);
	}
	public void datLunAn(){
		System.out.println(data+"."+ luna+"."+ an);
	}
	public void pedometru(){
		System.out.println("Azi a-ti parcurs "+kmParcursi +" km   " +"Pasi:"+" "+pasi );
	}
	public static void main (String [] args){
	Ceas ceass = new Ceas();
		ceass.ora=12;
		ceass.min=55;
		ceass.sec=42;
		ceass.afisareOra();
	Ceas dat= new Ceas();
	    dat.data=5;
	    dat.luna=6;
	    dat.an=2019;
	    dat.datLunAn();
	Ceas ped = new Ceas();
	    ped.kmParcursi=1.56;
	    ped.pasi=1980;
	    ped.pedometru(); 
	}
}