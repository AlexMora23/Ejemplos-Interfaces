package ejemploInterfaces;

public class Computadora implements OnOff{
	private String modelo;
	public Computadora(String modelo) {
		
		this.modelo=modelo;

}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		System.out.println("Encendiendo Computadora");
		
	}
	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		System.out.println("Apagando Computadora");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return modelo;
	}
}
