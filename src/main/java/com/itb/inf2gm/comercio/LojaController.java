package com.itb.inf2gm.comercio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	public void listarProdutos() {
		System.out.println("Lista de produto");
	}

}
