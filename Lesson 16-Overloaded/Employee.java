public class Employee {
      
	int age;
	String name;
	String surname;
	int idnp;
	String adress;
	String city;
	boolean married;
	byte children;
         
        
	public Employee (String name, String surname){
           this.name=name;
           this.surname=surname;
            
        }
 	public Employee (String name,String surname, int age,int idnp){
 	       this(name,surname);
           this.age=age;
           this.idnp=idnp;
          
        }
    public Employee (String name,String surname, int age,int idnp,String adress, String city,boolean married,byte children ){
           this (name,surname,age,idnp);
           this.adress=adress;
           this.city=city;
           this.married=married;
           this.children=children;
          
        }
        public static void main(String [] args){
        Employee emp= new Employee("Adrian","Gamurari", 33, 137964644);
        System.out.println(emp.name+" "+emp.surname+" "+emp.age+" ani " +emp.idnp);
        }
    }