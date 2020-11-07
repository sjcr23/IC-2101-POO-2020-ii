
public class AparatoTermoregulable extends Aparato{
	private int temperaturaMinima;
	private int temperaturaMaxima;
	private int temperaturaActual;
	
	public AparatoTermoregulable(String nombre, String marca, int temperaturaMinima, int temperaturaMaxima){
		super(nombre, marca);
		this.temperaturaMinima = temperaturaMinima;
		this.temperaturaMaxima = temperaturaMaxima;
	}
	
	@Override
	public void encender(){
		super.encender();
		this.temperaturaActual = (temperaturaMinima + temperaturaMaxima)/2;
		System.out.println(super.toString() + "Temperatura actual: " + temperaturaActual + "° celcios.");
	}
	
	@Override
	public void apagar(){
		super.apagar();
		System.out.println(super.toString());
		}
}
