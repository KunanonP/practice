public class Main {

    public static void main(String[] args) {
//        boolean gameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (gameOver){
//            int finalscore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your new final score was: " + finalscore);
//        }

//        calculateScore(true, 800, 5, 100);
//        int highScore = calculateScore(true, 10000, 8, 200);
//        System.out.println("Your high score was: " + highScore);
        int highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Alpha", highScore);

        highScore = calculateHighScorePosition(900);
        displayHighScorePosition("Beta", highScore);

        highScore = calculateHighScorePosition(400);
        displayHighScorePosition("Cobra", highScore);

        highScore = calculateHighScorePosition(50);
        displayHighScorePosition("Delta", highScore);

        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Eco", highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Fox", highScore);

        }

//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        if (gameOver){
//            int finalscore = score + (levelCompleted * bonus);
//            return finalscore;
//        }
//            return -1;
//    }

    public static void displayHighScorePosition(String playerName, int position){

        if (playerName != null){
            System.out.println(playerName + " managed to get into position " + position + (" on high score table"));
        }
    }

    public static int calculateHighScorePosition(int score){

        if (score >= 1000){
            return 1;
        }else if (score >= 500 && score < 1000){
            return 2;
        }else if (score >= 100 && score < 500){
            return 3;
        }else{
            return 4;
        }
    }
}
