package com.company.temp.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.temp.ProductVO;
import com.company.temp.product.service.ProductService;


@Service
public class ProductServiceimpl implements ProductService {

	@Autowired
	ProductMapper dao;

	@Override
	public void insertProduct(ProductVO vo) {
		dao.insertProduct(vo);
	}
	
	@Override
	public List<ProductVO> getSearchProduct(ProductVO vo) {
		return dao.getSearchProduct(vo);
	}


	
}
