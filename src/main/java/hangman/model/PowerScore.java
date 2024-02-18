package hangman.model;
public class PowerScore implements GameScore{
    /**
     * @pre Se inicia con 0 puntos
     * @pre El puntaje minimo es 0
     * @pos Se bonifica con la iesima potencia de 5 a cada letra correcta 
     * @pos Se penaliza con -8 puntos cada letra incorrecta
     * @param correctCount
     * @param incorrectCount
     * @throws GameScoreException, Si correctCount o incorrectCount son negativos, o 
     	si el score que se va a retornar es negativo.
     * @return score, si el jugador pasa los 500 puntos, su puntaje será igualmente 500
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
        int score = 0;
    	if (correctCount < 0 || incorrectCount < 0) throw new GameScoreException(GameScoreException.LETRAS_NEGATIVAS);
		for(int i = 1; i <= correctCount; i++) {
			score += Math.pow(5, i);
		}
    	if (score - incorrectCount * 8 < 0) throw new GameScoreException(GameScoreException.SCORE_NEGATIVO);
        score -= incorrectCount * 8;
        if (score > 500) score = 500;
    	return score;
   }
   @Override
   public int reset(){
   return 0;
    }
}