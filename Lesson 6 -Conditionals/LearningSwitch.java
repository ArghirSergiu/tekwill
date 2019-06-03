public class LearningSwitch{
      public static void main (String [] args){
          final char a ='A',b='B',c='C',d='D',e='E',f='F',g='G',h='H',i='I',j='J',k='K',l='L',m='M',n='N',o='O',p='P',q='Q',r='R',s='S',t='T',u='U',v='V',w='W',x='X',y='Y',z='Z';
          
         char litera ='F';
         switch (litera){
                case a:
                case e:
                case i:
                case o:
                case u:
                  System.out.println("Litera introdusa este o vocala" );
                    break;
                default:
                    System.out.println("Litera introdusa este o consoana");
		}
			final byte qa=1,wa=2,ma=3,ra=4,ta=5,ya=6,ua=7,ia=8,oa=9,pa=10;
            byte nota = 8;
                switch (nota){
                case qa:
                System.out.println("Nota "+nota+"  Insuficienta!" );
                       break;
  	            case wa:
                System.out.println("Nota "+nota+"  Insuficienta!" );
                       break;
                 case ma:
                System.out.println("Nota "+nota+"  Insuficienta!" );
                       break;
                case ra:
                System.out.println("Nota "+nota+"  Insuficienta!" );
                       break;
                case ta:
                System.out.println("Nota "+nota+"   Insuficienta!" );
                       break;
                case ya:
                System.out.println(+nota+"  Satisfacator!" );
                       break;
                case ua:
                System.out.println(+nota+"  Satisfacator!" );
                       break;
				case ia:
                System.out.println(+nota+"  Bine !" );
                       break;
                 case oa:
                System.out.println(+nota+"  Bine!" );
                       break;
                case pa:
                System.out.println(+nota+"  Formidabil!" );
                       break;
                default : 
                System.out.println("Nota trebuie sa fie intre 1 si 10... Mai incercati.... " );
                       break;

}

}
}