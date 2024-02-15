package hangman.model;
public class OriginalScore implements GameScore{
        /**
         * @pre Se inicia con 100 puntos
         * @pre El puntaje minimo es 0
         * @pos Se penaliza cada letra incorrecta con -10 puntos
         * @param correctCount
         * @param incorrectCount
         * @throws GameScoreException
         * @return score
        */
        public int calculateScore (int correctCount, int incorrectCount) throws GameScoreException{

        }
}