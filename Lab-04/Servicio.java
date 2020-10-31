import java.util.ArrayList;

public class Servicio {
	// Declaramos los atributos de la clase "Servicio"
	public String nombre;
	public String descripcion;
	public int costoPorHora;
	public String hashtagsList;
	public double latitud;
	public double longitud;
	public String ubicacion;
	
	// Construyo mi clase "Servicio"
		public Servicio(String nombre,String descripcion,int tarifa, String hashtags, double latitud, double longitud) {
			this.nombre = nombre;
			this.descripcion = descripcion;
			this.costoPorHora = tarifa;
			this.hashtagsList = hashtags;
			this.latitud = latitud;
			this.longitud = longitud;
		}
	
	
		public String getNombre(){
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		public String getDescripcion(){
			return descripcion;
		}
		
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		public String getCostoPorHora(){
			return costoPorHora + "";
		}
		
		public void setCostoPorHora(int tarifa) {
			this.costoPorHora = tarifa;
		}
		
		
		public String getHashtags(){
			return hashtagsList;
			
			
		}
		public void setHashtags(String hashtags) {
			this.hashtagsList = hashtags;
		}
		
		public void setLatitud(double latitud) {
			this.latitud = latitud;
		}
		
		public String getLatitud(double latitud) {
			String latitudStr = String.valueOf(latitud);
			return latitudStr;
		}
		
		public void setLongitud(double latitud) {
			this.latitud = latitud;
		}
		
		public String getLongitud(double longitud) {
			String longitudStr = String.valueOf(longitud);
			return longitudStr;
		}
		
		public String getUbicacion(double latitud, double longitud){
			String ubicacion = "Ubicación: " + getLatitud(latitud) + ", " + getLongitud(longitud);
			return ubicacion;
		}
		
}

