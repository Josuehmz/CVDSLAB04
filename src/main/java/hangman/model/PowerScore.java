package hangman.model;
public class PowerScore implements GameScore{
    /**
     * @pre Se inicia con 0 puntos
     * @pre El puntaje minimo es 0
     * @pos Se bonifica con la iesima potencia de 5 a cada letra correcta 
     * @pos Se penaliza con -8 puntos cada letra incorrecta
     * @param correctCount
     * @param incorrectCount
     * @throws GameScoreException
     * @return score, si el jugador pasa los 500 puntos, su puntaje será igualmente 500
     */
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
        
    }
}