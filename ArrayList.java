import java.util.ArrayList;

public class ArrayList {

	public static void main(String[] args) {
		
		//String[] flores = new String[10];
		
		ArrayList<String> flores = new ArrayList<>();

		//flores[0] = "Margarida";
		
		flores.add("Marcarida");
		flores.add("Violeta");
		flores.add("Orquidea");
		flores.add("Lirius");
		flores.add("Girasol");
		flores.add("Gravo");
		flores.add("Cristamo");
		flores.add("Jasmine");

		//System.out.print(flores.toString());
		
		// primeiro eu coloco uma memoria(flor) e depois a lista(flores)
		for (String flor :  flores) {
			System.out.println(flor);
			
		}
		
		
	}

}
