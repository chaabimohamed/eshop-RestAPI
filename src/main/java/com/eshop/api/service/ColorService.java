package com.eshop.api.service;

import java.util.List;

import com.eshop.api.model.Color;

public interface ColorService {
	List<Color> showAllColor();
	Color newColor(Color size);
}
