package b2b2c.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import b2b2c.dto.UserDto;
import b2b2c.service.AccountService;
import b2b2c.service.OrderService;
import b2b2c.service.UserService;

@Controller
@RequestMapping(path="/api")
public class UserController {
	
	@Autowired AccountService accountService;
	@Autowired UserService userService;
	@Autowired OrderService orderService;
	
	@RequestMapping(path="/user/profile", method={ RequestMethod.GET })
	@ResponseBody
	public UserDto getProfile(int userId) {
		UserDto userDto = accountService.getUserById(userId);
		
		return userDto;
	}
	
	
	@RequestMapping(path="/login", method={ RequestMethod.POST })
	@ResponseBody
	public String loginByUserNameAndUserPass(String userName, String userPass) {
		UserDto userDto = userService.getUserDtoByUserNameAndUserPass(userName, userPass);
		if(userDto==null) {
			return("WRONG USERNAME OR PASSWORD!");
		}else {
			orderService.createOrder(userDto.getUserId());
			return("LOGIN SUCCESSFULLY!");	
		}
	}
	
//	@RequestMapping(path="logout", method= {RequestMethod.DELETE})
//	@ResponseBody
//	public String logout()
}