package com.company.temp.product.service;

import java.util.List;

import com.company.temp.ProductVO;

public interface ProductService {
	// 등록
	public void insertProduct(ProductVO vo);

	// 전체 조회
	public List<ProductVO> getSearchProduct(ProductVO vo);
	

}
