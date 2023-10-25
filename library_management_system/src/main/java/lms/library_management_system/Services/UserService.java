package lms.library_management_system.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lms.library_management_system.Repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
}
