package negocio;

import java.util.HashMap;

public class IdentificadorESenhas {

	HashMap<String, String> infos = new HashMap<>();

	public IdentificadorESenhas() {

		infos.put("Julio", "Hello");

	}

	public HashMap getIdentificadorEsenhas() {
		return infos;
	}

}
