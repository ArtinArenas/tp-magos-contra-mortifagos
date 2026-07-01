package exceptions;

// Excepción usada cuando un ataque automático no es válido.

public class AutoAttackException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public AutoAttackException(String message) {
		super(message);
	}

}
