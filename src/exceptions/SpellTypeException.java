package exceptions;

// Excepción usada para errores relacionados con el tipo de hechizo.

public class SpellTypeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SpellTypeException(String message) {
		super(message);
	}
}
