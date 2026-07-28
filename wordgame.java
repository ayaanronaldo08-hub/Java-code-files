public class wordgame {
    public static void main(String[] args) {
        wordmatch game = new wordmatch("mississippi");
        System.out.println(game.scoreGuess("iss"));

        wordmatch game2 = new wordmatch("concatenation");
        game2.findBetterGuess("ten", "nation");
    }
}

class wordmatch{
    private String secret;
    int occurence;

    public wordmatch(String word){
        secret = word;
    }

    public int scoreGuess(String guess){
        if ((0 < guess.length()) && (guess.length() <= secret.length())){
            for(int i = 0; i < (secret.length() - guess.length()); i++){
                String current = secret.substring(i, i + guess.length());
                if (guess.equals(current)){
                    occurence += 1;
                }
            }
        }else if (guess.length() <= secret.length()){
            System.out.println("Guess is too long");
        }else if (0 < guess.length()){
            System.out.println("Empty guess");
        }
        return (occurence * guess.length() * guess.length());
    }

    public void findBetterGuess(String guess1, String guess2){
        if (!(guess1.equals(guess2))){
            guess1.toLowerCase();
            guess2.toLowerCase();
            if (scoreGuess(guess1) > scoreGuess(guess2)){
                System.out.println("Highest Score: " + guess1);
            }else{
                System.out.println("Highest Score: " + guess2);
            }
        }else{
            System.out.println("Both guesses are the same. Enter different guesses");
        }
    }
}
