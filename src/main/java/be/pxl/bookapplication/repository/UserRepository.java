package be.pxl.bookapplication.repository;

import be.pxl.bookapplication.domain.User;
import be.pxl.bookapplication.domain.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.*;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email); // Return Optional<User>

}
