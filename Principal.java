package ejemploInterfaces;

public class Principal {
public static void main(String args[]){
		
		Auto auto = new Auto("Ford");
		Computadora compu = new Computadora("Hp Pavilion g4");
		Television tv = new Television("Samsumg");
		auto.encender();
		System.out.println("El modelo es: "+auto.toString());
		auto.apagar();
		compu.encender();
		System.out.println("El modelo es: "+compu.toString());
		compu.apagar();
		tv.encender();
		System.out.println("El modelo es: "+tv.toString());
		tv.apagar();
		
	
		System.out.println("Usamos polimorfismo con interfaces");
		OnOff obj=new Auto("Nissan");
		auto.encender();
		System.out.println("El modelo es: "+obj);
		auto.apagar();
	}

}
