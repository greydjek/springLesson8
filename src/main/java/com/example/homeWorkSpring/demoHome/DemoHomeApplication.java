package com.example.homeWorkSpring.demoHome;

import com.example.homeWorkSpring.demoHome.productService.ProductSevice;
import com.example.homeWorkSpring.demoHome.productService.SessionFactoryUtils;
import com.example.homeWorkSpring.demoHome.repository.ProductCommand;
public class DemoHomeApplication {

	public static void main(String[] args) {
		SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
		sessionFactoryUtils.init();
		try {
ProductCommand productCommand = new ProductSevice(sessionFactoryUtils);
System.out.println( productCommand.findById(1L).getProductKey());
sessionFactoryUtils.get

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sessionFactoryUtils.shutDown();;
		}
	}	}


