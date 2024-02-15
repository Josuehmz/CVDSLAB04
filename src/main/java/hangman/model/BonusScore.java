package hangman.model;
public class BonusScore implements GameScore{
    /**
     * @pre El juego inicia con 0 puntos
     * @pre El puntaje minimo es 0
     * @pos Se penaliza con -5 puntos cada letra incorrecta
     * @pos Se bonifica con 10 puntos cada letra correcta
     * @param correctCount
     * @param incorrectCount
     * @throws GameScoreException
     * @return score
    */
   @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
        return 0;
   }
}