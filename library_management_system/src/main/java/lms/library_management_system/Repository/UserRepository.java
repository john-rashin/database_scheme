package lms.library_management_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lms.library_management_system.Model.User;


@Repository
public interface UserRepository extends JpaRepository <User, Long> {
    
}
