package ejemploInterfaces;

public class Television implements OnOff {
	private String modelo;
	public Television(String modelo) {
		
		this.modelo=modelo;

}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo Televisor");
		
	}
	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando Televisor");
	
}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return modelo;
	}
}
