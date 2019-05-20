package b2b2c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import b2b2c.dto.UserDto;
import b2b2c.service.AccountService;

@Controller
@RequestMapping(path="/api")
public class UserController {
	
	@Autowired AccountService accountService;
	
	@RequestMapping(path="/user/profile", method={ RequestMethod.GET })
	@ResponseBody
	public UserDto getProfile(int userId) {
		UserDto userDto = accountService.getUserById(userId);
		
		return userDto;
	}
}