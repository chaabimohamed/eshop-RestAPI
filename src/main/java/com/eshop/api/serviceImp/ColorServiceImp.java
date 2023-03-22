package com.eshop.api.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eshop.api.model.Color;
import com.eshop.api.repository.ColorRepository;
import com.eshop.api.service.ColorService;


@Service
public class ColorServiceImp implements ColorService {
	ColorRepository colorRepository;
	

	public ColorServiceImp(ColorRepository colorRepository) {
		super();
		this.colorRepository = colorRepository;
	}

	@Override
	public List<Color> showAllColor() {
		return colorRepository.findAll();
	}

	@Override
	public Color newColor(Color size) {
		return colorRepository.save(size);
	}

}
