package b2b2c.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.dto.UserDto;
import b2b2c.model.UserModel;
import b2b2c.repository.UserRepository;
import b2b2c.util.B2b2cModelMapper;

@Service
public class UserService {
	
	@Autowired
	private B2b2cModelMapper b2b2cModelMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	public UserDto getUserDtoByUserNameAndUserPass(String userName, String userPass) {
		UserModel userModel = userRepository.loginByUserNameAndUserPass(userName, userPass);
		if(userModel!=null) {
			return b2b2cModelMapper.convertToDto(userModel);
		}else {
			return null;
		}
	}
	
	public boolean checkRegister(String userName) {
		if(userRepository.checkRegister(userName)==0) {
			return true;
		}else {
			return false;
		}
	}
}
