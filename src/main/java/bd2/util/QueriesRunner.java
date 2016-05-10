package bd2.util;

import bd2.model.Documento;

public class QueriesRunner {
	
	private static void TestQuery_1(){
		
		for(Documento d : Queries.query_1()){
			
			System.out.println("Documento: "+d);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		TestQuery_1();
		
	}

}
