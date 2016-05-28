package bd2.util;

import bd2.model.Documento;
import bd2.model.Moderador;

public class QueriesRunner {
	
	private static void TestQuery_1(){
		
		for(Documento documento : Queries.query_1()){
			
			System.out.println("Documento: "+documento);
			
		}
		
	}
	
	private static void TestQuery_2(){
		
		for(Moderador moderador : Queries.query_2()){
			
			System.out.println("Email: "+moderador.getEmail());
			
		}
		
	}
	
	public static void main(String[] args) {
		
		TestQuery_1();
		
		TestQuery_2();
		
	}

}
