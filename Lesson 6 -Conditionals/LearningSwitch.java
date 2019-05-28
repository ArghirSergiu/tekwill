public class LearningSwitch{
      public static void main (String [] args){
          final char a ='A',b='B',c='C',d='D',e='E',f='F',g='G',h='H';
          
         char litera ='F';
         switch (litera){
                 case a:
                System.out.println("Litera introdusa este o vocala" );
                       break;
                case b:
                System.out.println("Litera introdusa este o consoana" );
                       break;
 	case c:
                System.out.println("Litera introdusa este o consoana" );
                       break;
                  case d:
                System.out.println("Litera introdusa este o consoana" );
                       break;
                 case e:
                System.out.println("Litera introdusa este o vocala" );
                       break;
				case f:
                System.out.println("Litera introdusa este o consoana" );
                       break;
					case g:
                System.out.println("Litera introdusa este o consoana" );
                       break;
                  case h:
                System.out.println("Litera introdusa este o consoana" );
                       break;
              default:
                           System.out.println("Litera data nu e introdusa in sir !");
		}
			final byte q=1,w=2,m=3,r=4,t=5,y=6,u=7,i=8,o=9,p=10;
            byte nota = 8;
                System.out.println(nota);
			  switch (nota){
             case q:
                System.out.println("Nota Insuficienta!" );
                       break;
  	            case w:
                System.out.println("Nota Insuficienta!" );
                       break;
                 case m:
                System.out.println("Nota Insuficienta!" );
                       break;
                case r:
                System.out.println("Nota Insuficienta!" );
                       break;
                 case t:
                System.out.println("Nota Insuficienta!" );
                       break;
               case y:
                System.out.println("Satisfacator!" );
                       break;
				case u:
                System.out.println("Satisfacator!" );
                       break;
				case i:
                System.out.println("Bine !" );
                       break;
                 case o:
                System.out.println("Bine!" );
                       break;
                 case p:
                System.out.println("Formidabil!" );
                       break;
               default : 
                System.out.println("Nota trebuie sa fie intre 1 si 10... Mai incercati.... " );
                       break;

}

}
}