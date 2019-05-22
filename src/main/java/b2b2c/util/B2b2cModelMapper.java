package b2b2c.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import b2b2c.dto.*;
import b2b2c.model.*;

@Component
public class B2b2cModelMapper {
	private static final ModelMapper modelMapper = new ModelMapper();

	public CouponDto convertToDto(CouponModel couponModel) {
		CouponDto couponDto = modelMapper.map(couponModel, CouponDto.class);
		return couponDto;
	}

	public PaintDto convertToDto(PaintModel paintModel) {
		PaintDto paintDto = modelMapper.map(paintModel, PaintDto.class);
		return paintDto;
	}

	public UserDto convertToDto(UserModel userModel) {
		UserDto userDto = modelMapper.map(userModel, UserDto.class);
		return userDto;
	}
	
	public CartDto convertToDto(CartModel cartModel) {
		CartDto cartDto = modelMapper.map(cartModel, CartDto.class);
		return cartDto;
	}
}