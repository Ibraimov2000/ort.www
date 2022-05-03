package kg.ort.www.service;

import kg.ort.www.entity.Answer;
import kg.ort.www.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    @Autowired
    public AnswerService(AnswerRepository answerRepository) {
        this.answerRepository = answerRepository;
    }

    public Answer save(Answer answer) {
        return answerRepository.saveAndFlush(answer);
    }

    public Answer findById(Long id) {
        return answerRepository.findById(id).orElseThrow();
    }

    public void delete(Answer answer) {
        answerRepository.delete(answer);
    }
}
