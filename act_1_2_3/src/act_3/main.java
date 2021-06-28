package act_3;

public class main {

	public static void main(String[] args) 
	{
		Persona p1 =new  Persona("nahu",22);
		Persona p2 =new  Persona("jesica",10);
		Persona p3 =new  Persona("axel",15);
		Persona p4 =new  Persona("nahu",22);
		 
		System.out.println(p2.masJovenQue(p1));
		
		System.out.println(p1.tocayo(p4));
		System.out.println(p1.tocayo(p2));
		
		System.out.println(p1.mismaPersona(p4));
		System.out.println(p1.mismaPersona(p2));
	}

}
