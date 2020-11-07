public class Main {
	
	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		Controlador controlador = parser.cargarAparatos();
		System.out.println(controlador.get(2));
	}

}
