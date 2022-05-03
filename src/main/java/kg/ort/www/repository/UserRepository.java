package kg.ort.www.repository;

import kg.ort.www.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")
    User findByEmail(String email);

    User findByUsername(String email);
    User findByName(String name);
    User findByGoogleUsername(String googleUsername);
    User findByGoogleName(String googleName);
}
