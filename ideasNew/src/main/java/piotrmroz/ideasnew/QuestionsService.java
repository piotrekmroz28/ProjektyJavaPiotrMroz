package piotrmroz.ideasnew;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuestionsService {

    private final IdeasConfiguration ideasConfiguration;

    public QuestionsService(IdeasConfiguration ideasConfiguration) {
        this.ideasConfiguration = ideasConfiguration;
    }

    public List<Question> getQuestions() {
        return Arrays.asList(
                new Question("Question 1"),
                new Question("Question 2")
        );
    }

    public String test(String value) {
        return String.format("Hello %s %s", ideasConfiguration.getName(), value);
    }
}
