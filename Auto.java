package ejemploInterfaces;

public class Auto implements OnOff{
	private String modelo;
	public Auto(String modelo){
		
		this.modelo=modelo;
		
	}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo Auto");
		
	}
	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Auto apagado");
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return modelo;
	}
	}
