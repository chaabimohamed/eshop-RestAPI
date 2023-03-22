package com.eshop.api.serviceImp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eshop.api.model.Image;
import com.eshop.api.repository.ImageRepository;
import com.eshop.api.service.ImageService;

@Service
public class ImageServiceImp implements ImageService{
	ImageRepository imageRepository;
	
	
	public ImageServiceImp(ImageRepository imageRepository) {
		super();
		this.imageRepository = imageRepository;
	}

	@Override
	public List<Image> showAllImg() {
		return imageRepository.findAll();
	}

	@Override
	public Image newImg(Image image) {
		return imageRepository.save(image);
	}

}
