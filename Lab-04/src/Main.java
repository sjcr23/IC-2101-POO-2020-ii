class Main {
	
	public static void main(String[] args) {
		
		// Primer ejemplo:
		String descripcion1 = "Nos trasladamos hasta su hogar para realizar una limpieza profunda de sus alfombras, nuestros productos le aseguran desinfección total del 99% de virus y bacterias. (única empresa con garantía anti covid19).";
		String hashtags = "#limpieza #muebles #casa #covid19";				
		Servicio servicio1 = new Servicio("Limpieza de Alfombras", descripcion1, 1500, hashtags, 10.068230, -84.312330);		
		System.out.println("1.    " + servicio1.getNombre());
		System.out.println("2.    " + servicio1.getDescripcion());
		System.out.println("3.    " + servicio1.getCostoPorHora());
		System.out.println("4.    " + servicio1.getHashtags());
		System.out.println("5.    " + servicio1.getUbicacion(servicio1.latitud, servicio1.longitud));
		
		
		// Primer ejemplo:
		String descripcion2 = "Ofrecemos servicios de jardinería en la provincia de Alajuela. Contamos con todo el equipo necesario, cuidamos de sus plantas";
		String hashtags2 = "#limpieza #muebles #casa #covid19";				
		Servicio servicio2 = new Servicio("Jardinería", descripcion2, 8000, hashtags2, 16.974260, -96.726830);		
		System.out.println("1.    " + servicio2.getNombre());
		System.out.println("2.    " + servicio2.getDescripcion());
		System.out.println("3.    " + servicio2.getCostoPorHora());
		System.out.println("4.    " + servicio2.getHashtags());
		System.out.println("5.    " + servicio2.getUbicacion(servicio2.latitud, servicio2.longitud));

		// Primer ejemplo:
		String descripcion3 = "Somos una empresa dedicada al desarrollo de software, adicionalmente damos clases de ingeniería en computación con acreditación del SINAES.";
		String hashtags3 = "#learning #development #opensource";				
		Servicio servicio3 = new Servicio("Jardinería", descripcion3, 8000, hashtags3, 16.974260, -96.726830);		
		System.out.println("1.    " + servicio3.getNombre());
		System.out.println("2.    " + servicio3.getDescripcion());
		System.out.println("3.    " + servicio3.getCostoPorHora());
		System.out.println("4.    " + servicio3.getHashtags());
		System.out.println("5.    " + servicio3.getUbicacion(servicio3.latitud, servicio3.longitud));
	}
	
}