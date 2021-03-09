package com.company.temp;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.temp.product.service.ProductService;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {

	@Autowired
	ProductService productService;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	// 전체 조회
	@RequestMapping("/product")
	public String getSearchProduct(ProductVO vo, Model model) {
		model.addAttribute("list", productService.getSearchProduct(vo));
		return "product/product";
	}

	// 입력폼
	@RequestMapping("/insert")
	public String insert(ProductVO vo, Model model) {
		return "product/insertForm";
	}
	
	//입력처리
	@PostMapping("/insertProduct")
	public String insertProduct(ProductVO vo) {
		logger.debug(vo.toString());
		productService.insertProduct(vo);
		return "redirect:product";
	}
	
	@RequestMapping("/top")
	public String top() {
		return "top";
	}


}
