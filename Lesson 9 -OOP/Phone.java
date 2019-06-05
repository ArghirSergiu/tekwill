public class Phone{
	String model;
	String sistemOp;
	double ecran;
	int baterie;
	int pret;
	public void specs(){
		System.out.println(model+"  "+sistemOp+"  "+ ecran+" inch "+ baterie+" mAh");
        }
    public void stock(){
    	System.out.println(model+" Este in stoc.");
    }
    public void pret(){
    	System.out.println(model+" "+"Pret  "+pret);
    }
    public static void main (String [] args){
    Phone telSpec = new Phone();
    	telSpec.model="Samsung J5";
    	telSpec.sistemOp="Android 8.0";
    	telSpec.ecran=5.5;
    	telSpec.baterie=3700;
    	telSpec.specs();
    Phone stoc = new Phone();
        stoc.model= telSpec.model;
        stoc.stock();
    Phone pret =new Phone();
        pret.model=telSpec.model;
        pret.pret=5500;
        pret.pret();
    }

    


}