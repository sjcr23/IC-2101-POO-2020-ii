import java.util.Random;

public class AparatoConSeñal extends Aparato{
	private float[] señales;
	private float señalActual;
	
	public AparatoConSeñal(String nombre, String marca, float[] señales) {
		super(nombre, marca);
		this.señales = señales;
	}

	@Override
	public void encender() {
		super.encender();
		Random ran = new Random();
		int aleatorio = ran.nextInt(señales.length);
		this.señalActual = señales[aleatorio];
		System.out.println(super.toString() + "Acutal: " + señalActual);
		
	}

	@Override
	public void apagar() {
		super.apagar();
		System.out.println(super.toString());
	}
}
