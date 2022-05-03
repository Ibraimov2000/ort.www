package kg.ort.www.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "user_exams")
@Data
@NoArgsConstructor
public class UserExam {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name = "password")
    private String password;

    @Column(name = "status",nullable = false)
    private int status;

    @ManyToOne(targetEntity = Exam.class)
    @JoinColumn(name= "exam_id", nullable=false)
    private Exam exams;

    public UserExam(User user, Exam exam,String password) {
        this.exams=exam;
        this.user=user;
        this.password=password;
        this.status=0;
    }

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name= "user_id", nullable=false)
    private User user;
}
