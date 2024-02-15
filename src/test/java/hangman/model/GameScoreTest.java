package hangman.model;
import hangman.model.*;

import java.beans.Transient;

import org.junit.Assert;
import org.junit.Test;

/**
 * Clase de implementacion de pruebas
*/
public class GameScoreTest{
    @Test    
    public void testOriginalScoreWithCorrectLetters() 
    {         
        OriginalScore calculator = new OriginalScore();         
        int score = calculator.calculateScore("hola", "hola");         
        assertEquals(100, score, "El puntaje debe ser 100 para letras correctas.");}

    @Test    
    public void testOriginalScoreWithIncorrectLetters() 
    {         
        OriginalScore calculator = new OriginalScore();         
        int score = calculator.calculateScore("hola", "adios");         
        assertEquals(60, score, "El puntaje debe ser 60 para letras incorrectas.");}
    @Test
    public void correctLettersScore(){
        OriginalScore game = new OriginalScore();
        int score = game.calculateScore(10, 0);
        assertTrue(score == 100, "El puntaje debe ser 100 para las letras correctas");
    }
}