import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class JSONParser {
	private File file;
	private ObjectMapper mapper;
	private JsonNode nodo;
	
	public JSONParser() {
		file = new File("resources/data.json");
		mapper = new ObjectMapper();
		
		try {
			nodo = mapper.readTree(file);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Controlador cargarAparatos(){
		Controlador controlador = new Controlador();
		ArrayNode aparatos = (ArrayNode) nodo.get("aparatos");
		
		if (aparatos != null) {
			for(int i = 0; i < aparatos.size(); i++) {
				JsonNode aparato = aparatos.get(i);
				String nombre = aparato.get("nombre").asText();
				String marca = aparato.get("marca").asText();
				String tipo = aparato.get("tipo").asText();
				switch(tipo) {
					case"termoregulable":
						int minima = aparato.get("temperaturaMinima").asInt();
						int maxima = aparato.get("temperaturaMaxima").asInt();
						AparatoTermoregulable atr = new AparatoTermoregulable(nombre, marca, minima, maxima);
						controlador.add(atr);
					case"modalidades":
						ArrayNode modalidadesJSON = (ArrayNode) nodo.get("modalidades");
						if(modalidadesJSON != null) {
							String[] modalidades = new String[modalidadesJSON.size()];
							for (int j = 0; j < modalidadesJSON.size();j++) {
								modalidades[j] = modalidadesJSON.get(j).asText();
							}
							AparatoConModalidad acm = new AparatoConModalidad(nombre, marca, modalidades);
							controlador.add(acm);
						}
					case"señales":
						ArrayNode señalesJSON = (ArrayNode) nodo.get("señales");
						if(señalesJSON != null) {
							float[] señales = new float[señalesJSON.size()];
							for (int j = 0; j < señalesJSON.size();j++) {
								señales[j] = señalesJSON.get(j).asLong();
							}
							AparatoConSeñal acs = new AparatoConSeñal(nombre, marca, señales);
							controlador.add(acs);
						}
				}
			}
		}
		return controlador;
	}
}
