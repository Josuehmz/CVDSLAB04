package hangman.model;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Clase de implementacion de pruebas
*/
public class GameScoreTest{
	/**
	 * Clase de Equivalencia01 --> No se tienen letras incorrectas.
	 * Clase de Equivalencia 02 --> El puntaje final es 100 - 10*#letras incorrectas
	 * Caso Borde -->
	 *
	 */
    @Test    
    public void testOriginalScoreWithCorrectLetters() 
    {         
        OriginalScore calculator = new OriginalScore();
        int score;
		try {
			score = calculator.calculateScore(5, 0);
			assertEquals(100, score,"El puntaje debe ser 100 para letras correctas.");
			score = calculator.calculateScore(10,5);
			assertEquals(50, score);
		} catch (GameScoreException e) {
			fail("Lanzo Excepcion");
		}         
        
    }
    
    /**
	 * Clase de Equivalencia 01 --> El puntaje final es 100 - 10*#letras incorrectas
	 * Caso Borde --> El puntaje minimo es 0 y el maximo 100
	 *
	 **/

    @Test    
    public void testOriginalScoreWithIncorrectLetters()
    {         
        OriginalScore calculator = new OriginalScore();         
        int score;
		try {
			score = calculator.calculateScore(5, 6);
			assertEquals(40, score);
			score = calculator.calculateScore(1, 10);
			assertEquals(0, score);
			score = calculator.calculateScore(1, 0);
			assertEquals(100, score);
		} catch (GameScoreException e) {
			
		}         
        
    }
    
    /**
	 * Clase de Equivalencia 01 --> El valor de letras correctas es negativo.
	 * Clase de Equivalencia 02 --> El valor de letras incorrectas es negativo
	 * Caso Borde --> No se pueden tener más de 10 letras incorrectas
	 *
	 */
    
    @Test    
    public void testOriginalScoreInvalid()
    {         
        OriginalScore calculator = new OriginalScore();         
        int score;
		try {
			score = calculator.calculateScore(-55, 6);
			fail("No lanzo excepción");
		} catch (GameScoreException e) {
			assertEquals(e.getMessage(),GameScoreException.LETRAS_NEGATIVAS);
			
		}      
		
		try {
			score = calculator.calculateScore(55, -6);
			fail("No lanzo excepción");
		} catch (GameScoreException e) {
			assertEquals(e.getMessage(),GameScoreException.LETRAS_NEGATIVAS);
			
		}
		
		try {
			score = calculator.calculateScore(55, 11);
			fail("No lanzo excepción");
		} catch (GameScoreException e) {
			assertEquals(e.getMessage(),GameScoreException.SCORE_NEGATIVO);
			
		}      
        
    }
    
    /**
	 * Clase de Equivalencia01 --> #Correctas * 10 - #Incorrectas* 5 >= 0.
	 * Caso Borde -->  #Correctas * 10 - #Incorrectas* 5 >= 0.
	 *
	 */
    @Test    
    public void testBonusScore() 
    {         
        BonusScore calculator = new BonusScore();
        int score;
		try {
			score = calculator.calculateScore(8, 4);
			assertEquals(60, score,"El puntaje debe ser 100 para letras correctas.");
			score = calculator.calculateScore(10,20);
			assertEquals(0, score);
		} catch (GameScoreException e) {
			fail("Lanzo Excepcion");
		}         
        
    }
        
    /**
	 * Clase de Equivalencia 01 --> El valor de letras correctas es negativo.
	 * Clase de Equivalencia 02 --> El valor de letras incorrectas es negativo
	 * Caso Borde --> ! (#Correctas * 10 - #Incorrectas* 5 < 0).
	 *
	 */
    
    @Test    
    public void testBonusScoreInvalid()
    {         
        OriginalScore calculator = new OriginalScore();         
        int score;
		try {
			score = calculator.calculateScore(-1, 6);
			fail("No lanzo excepción");
		} catch (GameScoreException e) {
			assertEquals(e.getMessage(),GameScoreException.LETRAS_NEGATIVAS);
			
		}      
		
		try {
			score = calculator.calculateScore(2, -7);
			fail("No lanzo excepción");
		} catch (GameScoreException e) {
			assertEquals(e.getMessage(),GameScoreException.LETRAS_NEGATIVAS);
			
		}
		
		try {
			score = calculator.calculateScore(2, 10);
			fail("No lanzo excepción");
		} catch (GameScoreException e) {
			assertEquals(e.getMessage(),GameScoreException.SCORE_NEGATIVO);
			
		}      
        
    }
    
    
    
    /**
	 * Clase de Equivalencia01 --> #Correctas**i - #Incorrectas* 8 >= 0.
	 * Clase de Equivalencia01 --> #Correctas**i - #Incorrectas* 8 >= 0.
	 * Clase de Equivalencia01 --> #Correctas**i - #Incorrectas* 8 <= 500
	 *
	 */
    @Test    
    public void testPowerBonusScore() 
    {         
        PowerScore calculator = new PowerScore();
        int score;
		try {
			score = calculator.calculateScore(3, 2);
			assertTrue(score >= 0);
			score = calculator.calculateScore(8, 20);
			assertEquals(500, score);
		} catch (GameScoreException e) {
			fail("Lanzo Excepcion");
		}         
        
    }
        
    /**
	 * Clase de Equivalencia 01 --> El valor de letras correctas es negativo.
	 * Clase de Equivalencia 02 --> El valor de letras incorrectas es negativo
	 * Caso Borde --> ! (#Correctas * 10 - #Incorrectas* 5 < 0).
	 *
	 */
    
    @Test    
    public void testPowerBonusScoreInvalid()
    {         
        PowerScore calculator = new PowerScore();         
        int score;
		try {
			score = calculator.calculateScore(-1, 6);
			fail("No lanzo excepción");
		} catch (GameScoreException e) {
			assertEquals(e.getMessage(),GameScoreException.LETRAS_NEGATIVAS);
			
		}      
		
		try {
			score = calculator.calculateScore(2, -7);
			fail("No lanzo excepción");
		} catch (GameScoreException e) {
			assertEquals(e.getMessage(),GameScoreException.LETRAS_NEGATIVAS);
			
		}
		
		try {
			score = calculator.calculateScore(2, 10);
			fail("No lanzo excepción");
		} catch (GameScoreException e) {
			assertEquals(e.getMessage(),GameScoreException.SCORE_NEGATIVO);
			
		}      
        
    }
    
}