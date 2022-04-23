package br.com.luciano.sgv.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luciano.sgv.dto.ProdutoDto;
import br.com.luciano.sgv.entities.Produto;
import br.com.luciano.sgv.form.ProdutoForm;
import br.com.luciano.sgv.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;

	public List<ProdutoDto> buscarTodos() {

		List<Produto> produtos = produtoRepository.findAll();

		return produtos.stream().map(x -> new ProdutoDto(x)).collect(Collectors.toList());
	}

	public List<ProdutoDto> buscarPorId(Long id) {

		List<Produto> produtos = produtoRepository.findByIdDto(id);

		return produtos.stream().map(x -> new ProdutoDto(x)).collect(Collectors.toList());
	}

	public List<ProdutoDto> cadastrar(ProdutoForm produtoForm) {

		Produto produto = new Produto(produtoForm);

		produtoRepository.save(produto);

		List<Produto> novoProduto = produtoRepository.findByIdDto(produto.getId());

		return novoProduto.stream().map(x -> new ProdutoDto(x)).collect(Collectors.toList());
	}
}
