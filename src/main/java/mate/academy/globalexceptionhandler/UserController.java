package mate.academy.globalexceptionhandler;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @PostMapping
    public ResponseEntity<String> createUser(@Validated @RequestBody UserDTO userDTO) {
        return ResponseEntity.ok("User created successfully");
    }
}

