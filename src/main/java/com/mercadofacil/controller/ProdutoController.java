package com.mercadofacil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mercadofacil.entity.Produto;

@RestController
public class ProdutoController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "Hello";
    }
	
	public Produto get() {
        Produto p = new Produto(1, "a");
        return p;
    }
}
