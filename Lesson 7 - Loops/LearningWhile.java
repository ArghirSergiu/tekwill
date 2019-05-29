public class LearningWhile {
    public static void main (String [] args){
       int num  = 0, par =0, impar =50;
	      System.out.println("____Enumararea de la 0 la 100:_____");
       while (num <=100){
           System.out.println (num);
		num++;
		}
          System.out.println("____Numere pare interval 0-50 :_____");
		  while(par<=50){
			  par++;
			  if(par%2==0){
           System.out.println (par);
		  }}
			
			  System.out.println("____Numere impare interval 50-100 :_____");
		  while(impar<100){
			  impar++;
			  if(impar%2==1){
           System.out.println (impar);
		  }}
       
    }

}