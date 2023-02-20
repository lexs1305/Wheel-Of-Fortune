public class Question {
    private String text;
    private String[] ansewrs;
    private String correctAnswer, category;
    private int difficulty;

    public Question(String text, String[] answers, String correctAnswer, String category, int difficulty){
        this.text = text;
        this.ansewrs = answers;
        this.correctAnswer = correctAnswer;
        this.category = category;
        this.difficulty = difficulty;
    }

    public String getQuestion(){
        String out = "---Category: " + category + "---\n" + text + "\n";
        for (String ans : ansewrs) {
            out += ">" + ans + "\n";
        }
        return out;
    }
    public int getDifficulty(){
        return difficulty;
    }
}
