package b2b2c.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import b2b2c.dto.PaintDto;
import b2b2c.model.PaintModel;
import b2b2c.repository.PaintRepository;

@Service
public class PaintService {
	
	private static final ModelMapper modelMapper = new ModelMapper();

	@Autowired
	private PaintRepository paintRepository;
	
	public PaintDto getPaintById(int paintId) {
		PaintModel paintModel = paintRepository.findOne(paintId);
		PaintDto paintDto = convertToDto(paintModel);
		return paintDto;
	}
	
	private PaintDto convertToDto(PaintModel paintModel) {
		PaintDto paintDto = modelMapper.map(paintModel, PaintDto.class);
		return paintDto;
	}
}
