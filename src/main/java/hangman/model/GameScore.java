package hangman.model;
public interface GameScore{
    /**
     * @param int correctCount Cantidad de letras correctas
     * @param int incorrectCount Cantidad de letras incorrectas
     * @return int que representa el score
    */
    
    public abstract int calculateScore(int correctCount, int incorrectCount) throws GameScoreException;
    public abstract int reset();
}