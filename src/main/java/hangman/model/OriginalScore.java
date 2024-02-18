package hangman.model;
public class OriginalScore implements GameScore{
        /**
         * @pre Se inicia con 100 puntos
         * @pre El puntaje minimo es 0
         * @pos Se penaliza cada letra incorrecta con -10 puntos
         * @param correctCount
         * @param incorrectCount
         * @throws GameScoreException, Si correctCount o incorrectCount son negativos, o 
     		si el score que se va a retornar es negativo.
         * @return score
        */
        @Override
        public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
            if (correctCount < 0 || incorrectCount < 0) throw new GameScoreException(GameScoreException.LETRAS_NEGATIVAS);
    		if (incorrectCount > 10) throw new GameScoreException(GameScoreException.SCORE_NEGATIVO);
            return 100 - incorrectCount * 10;
       }
}