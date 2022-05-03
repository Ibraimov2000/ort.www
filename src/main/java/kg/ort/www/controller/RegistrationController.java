package kg.ort.www.controller;

import kg.ort.www.entity.Role;
import kg.ort.www.entity.User;
import kg.ort.www.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class RegistrationController
{
	private final UserService userService;

	@Autowired
	public RegistrationController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/registration")
	public String registration()
	{
		return "registration";
	}

	@PostMapping("/registration")
	public String addUser(String name, String username, String password)
	{
		User user = new User();
		user.setName(name);
		user.setUsername(username);
		user.setPassword(password);
		user.setActive(true);
		user.setRoles(Collections.singleton(Role.USER));

		userService.addUser(user);

		return "redirect:/login";
	}
}
