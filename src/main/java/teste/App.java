package teste;

import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Map<String, String> path = System.getenv();
		System.out.println(">>>>>>>> este é o diretório : " +path.get("HOME"));

	}

}
