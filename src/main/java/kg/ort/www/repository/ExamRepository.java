package kg.ort.www.repository;

import kg.ort.www.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {

    @Query("SELECT e FROM Exam e WHERE e.organisers.id = ?1")
    List<Exam> findByOrganiserId(Long organiser_id);
}
