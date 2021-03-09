package com.company.temp.product.service.impl;

import java.util.List;

import com.company.temp.ProductVO;


public interface ProductMapper {
	// 등록
	public void insertProduct(ProductVO vo);

	// 전체 조회
	public List<ProductVO> getSearchProduct(ProductVO vo);
	
}
