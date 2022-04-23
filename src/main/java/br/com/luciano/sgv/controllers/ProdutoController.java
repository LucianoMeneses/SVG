package br.com.luciano.sgv.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.luciano.sgv.dto.ProdutoDto;
import br.com.luciano.sgv.form.ProdutoForm;
import br.com.luciano.sgv.service.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<ProdutoDto>> buscarTodos(){
		
		List<ProdutoDto> produtos = produtoService.buscarTodos();
		
		return ResponseEntity.ok(produtos);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<List<ProdutoDto>> buscarPorId(@PathVariable Long id){
		
		List<ProdutoDto> produtos = produtoService.buscarPorId(id);
		
		return ResponseEntity.ok(produtos);
	}
	
	@PostMapping
	public ResponseEntity<List<ProdutoDto>> cadastrar(@RequestBody ProdutoForm produtoForm) {
		
		List<ProdutoDto> produto = produtoService.cadastrar(produtoForm);
				
		return ResponseEntity.ok(produto);
	}
}