package kg.ort.www.service;

import kg.ort.www.entity.Exam;
import kg.ort.www.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExamService {

    private final ExamRepository examRepository;

    @Autowired
    public ExamService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    public Exam findById(Long id) {
        return examRepository.findById(id).orElseThrow();
    }

    public Exam save(Exam exam) {
        return examRepository.saveAndFlush(exam);
    }
}
