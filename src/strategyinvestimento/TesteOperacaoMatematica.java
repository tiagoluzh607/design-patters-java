package strategyinvestimento;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class TesteOperacaoMatematica {

	public static void main(String[] args) {
		
	
		ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
          try{
            String conta = "7/2"; //passa quanquer conta aqui
            String resultado = engine.eval(conta).toString();
            System.out.println("Resultado: "+resultado);
          }catch(Exception e){
        	    	
          }

	}

}
