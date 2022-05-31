package teste;
import facade.Facade;
public class Test {
	public static void main(String[] args) {		
		
		// Facade		
		Facade facade = new Facade();
		facade.migrarCliente("João", "81610140");
	}
}