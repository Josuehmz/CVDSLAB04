package hangman.model;
public class BonusScore implements GameScore{
    /**
     * @pre El juego inicia con 0 puntos
     * @pre El puntaje minimo es 0
     * @pos Se penaliza con -5 puntos cada letra incorrecta
     * @pos Se bonifica con 10 puntos cada letra correcta
     * @param correctCount
     * @param incorrectCount
     * @throws GameScoreException, Si correctCount o incorrectCount son negativos, o 
     	si el score que se va a retornar es negativo.
     * @return score
    */
   @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
        if (correctCount < 0 || incorrectCount < 0) throw new GameScoreException(GameScoreException.LETRAS_NEGATIVAS);
		if (100 + correctCount * 10- incorrectCount * 5 < 0) throw new GameScoreException(GameScoreException.SCORE_NEGATIVO);
        return 100 + correctCount * 10- incorrectCount * 5;
   }
   @Override
   public int reset(){
    return 0;
   }
}