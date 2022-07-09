package com.br.nelioalves.loja;

import com.br.nelioalves.loja.entity.Categoria;
import com.br.nelioalves.loja.entity.Produto;
import com.br.nelioalves.loja.repository.CategoriaRepository;
import com.br.nelioalves.loja.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Array;
import java.util.Arrays;

@SpringBootApplication
public class LojaApplication implements CommandLineRunner {

	@Autowired
    private  CategoriaRepository repositoryCat;
	@Autowired
	private ProdutoRepository Prorepository;

	public static void main(String[] args) {
		SpringApplication.run(LojaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		Categoria cat1 = new Categoria("rafael");
		Categoria cat2 = new Categoria("rafael");



		Produto p1 = new Produto("computador",3500.0);
		Produto p2 = new Produto("impressora",800.0);
		Produto p3 = new Produto("mouse",80.0);

		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));

		repositoryCat.saveAll(Arrays.asList(cat1, cat2));
		Prorepository.saveAll(Arrays.asList(p1,p2,p3));

	}
}
