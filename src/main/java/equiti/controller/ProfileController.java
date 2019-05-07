package equiti.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@GetMapping("/profile")
	public String profile(@RequestParam(value = "name", defaultValue = "PivotalSoftware") String name) throws InterruptedException, ExecutionException {
		return name;
	}

}