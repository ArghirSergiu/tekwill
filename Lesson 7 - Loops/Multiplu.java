public class Multiplu {
 public static void main (String [] args){
	 System.out.println("___________Multiplu cu  For:______");
	 int count =0;
	  for(int i = 8; count <=40 ; i=i+8){
          count++;
         System.out.println(i);
	 }
	       
           System.out.println("___________Multiplu cu  While :______");
		  int count2 = 0;
		  int multiplu_8=0;
		  while (count2 <40){
			  System.out.println(multiplu_8+8);
			  multiplu_8=multiplu_8+8;
			  count2++;
		  }
		   int multi =8,count3=0;
		   System.out.println("___________Multiplu cu  Do While :______");
		  do{
			   
		       System.out.println(multi);
			   multi=multi+8;
			   
			  count3++;
		  }while (count3<=40);
		   
}}