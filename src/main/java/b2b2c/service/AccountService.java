package b2b2c.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.repository.UserRepository;
import b2b2c.dto.UserDto;
import b2b2c.model.UserModel;

@Service
public class AccountService {
	private static final ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	private UserRepository userRepository;
	
	public UserDto getUserById(int userId) {
		UserModel userModel = userRepository.findOne(userId);
		UserDto userDto = convertToDto(userModel);
		return userDto;
	}
	
	private UserDto convertToDto(UserModel userModel) {
		UserDto userDto = modelMapper.map(userModel, UserDto.class);
		return userDto;
	}
}
