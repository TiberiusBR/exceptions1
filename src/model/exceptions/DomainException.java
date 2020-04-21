package model.exceptions;

//CLASSE SERIALIZABLE - os objetos dessa classe podem ser convertidas para bytes e navegar em redes, arquivos etc.
//Nesse caso, é a EXCEPTION/RUNTIMEEXCEPTION.

public class DomainException extends RuntimeException{ //Exception - Compilador obriga a tratar/ RuntimeException - não é obrigado.
	
	private static final long serialVersionUID = 1L; //Versão padrão declarada.
	
	public DomainException (String msg) { //Recebe uma String como argumento.
		super(msg); /*Repassa a mensagem para o construtor da superclasse.
					Permite a instancia da exceção personalizada, passando uma mensagem para ela.*/
	}
	
	

}
