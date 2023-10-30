package apresentação;

import negocio.IdentificadorESenhas;

public class Main {

	public static void main(String[] args) {

		IdentificadorESenhas identificadorESenhas = new IdentificadorESenhas();
		
		new PaginaPrincipal(identificadorESenhas.getIdentificadorEsenhas());
		
	}

}
