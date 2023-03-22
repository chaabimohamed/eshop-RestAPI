package com.eshop.api.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eshop.api.model.Size;
import com.eshop.api.repository.SizeRepository;
import com.eshop.api.service.SizeService;

@Service
public class SizeServiceImp implements SizeService{

	SizeRepository sizeRepository;

	public SizeServiceImp(SizeRepository sizeRepository) {
		super();
		this.sizeRepository = sizeRepository;
	}

	@Override
	public List<Size> showAllSizes() {
		return sizeRepository.findAll();
	}

	@Override
	public Size newSize(Size size) {
		return sizeRepository.save(size);
	}
	
	
	
}
