package com.eshop.api.service;

import java.util.List;

import com.eshop.api.model.Image;

public interface ImageService {
	List<Image> showAllImg();
	Image newImg(Image image);
}
