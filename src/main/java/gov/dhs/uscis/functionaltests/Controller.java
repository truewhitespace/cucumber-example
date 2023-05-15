package gov.dhs.uscis.functionaltests;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/api")
public class Controller {

    public Controller() {
    }

    @RequestMapping(method = RequestMethod.GET, value = "/endpoint")
    public ResponseEntity<?> getMethod() {
        return ResponseEntity.ok("Blowow");
    }
}
