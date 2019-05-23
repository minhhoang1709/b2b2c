package b2b2c.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.repository.UserRepository;
import b2b2c.util.B2b2cModelMapper;
import b2b2c.dto.UserDto;
import b2b2c.model.UserModel;

@Service
public class AccountService {
	@Autowired
	private B2b2cModelMapper b2b2cModelMapper;
	
	@Autowired
	private UserRepository userRepository;
	
	public UserDto getUserById(int userId) {
		UserModel userModel = userRepository.findOne(userId);
		UserDto userDto = b2b2cModelMapper.convertToDto(userModel);
		return userDto;
	}
}
