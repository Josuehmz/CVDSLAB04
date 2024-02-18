package hangman.model;

public class GameScoreException extends Exception {
	public static final String LETRAS_NEGATIVAS = "El numero de letras no puede ser negativo";
	public static final String SCORE_NEGATIVO= "Score Negativo";


	
	public GameScoreException(String message) {
		super(message);
	}
}
