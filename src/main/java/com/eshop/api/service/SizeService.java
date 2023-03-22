package com.eshop.api.service;

import java.util.List;

import com.eshop.api.model.Size;

public interface SizeService {
	List<Size> showAllSizes();
	Size newSize(Size size);
}
