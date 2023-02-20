import java.util.ArrayList;
import java.util.List;

public class QuestionsManager {
    private List<Question> questions = new ArrayList<>();
    private FileManagment fileManagment = new FileManagment();
    public QuestionManagers(){
        questions = fileManagment.getQuestionsList();
    }
}
