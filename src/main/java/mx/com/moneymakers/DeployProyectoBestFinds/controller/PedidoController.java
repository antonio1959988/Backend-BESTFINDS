package mx.com.moneymakers.DeployProyectoBestFinds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Pedido;
import mx.com.moneymakers.DeployProyectoBestFinds.service.PedidoService;

@RestController
@RequestMapping(path = "/pedidos")
@CrossOrigin(origins = "#", methods = RequestMethod.GET)
public class PedidoController {
	
	private final PedidoService pedidoService;
	
	// Constructor
	@Autowired
	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	
	// Método GET para mostrar todos los pedidos
	@GetMapping
	public List<Pedido> getAllPedido(){
		return pedidoService.getAllPedido();
	}
	
	/*
	// Método POST para crear un pedido
	@PostMapping
	public void createPedido(@RequestBody Pedido pedido) {
		pedidoService.createPedido(pedido);
	}
	
	// Método GET para mostrar pedido por id
	@GetMapping("/{id}")
	public Pedido getPedidoById(@PathVariable Long id) {
		return pedidoService.getPedidoById(id);
	}
	
	// Método PUT para actualizar pedido por id
	@PutMapping("/{id}")
	public void updatePedido(@PathVariable Long id, @RequestBody Pedido pedido) {
		pedidoService.updatePedido(id, pedido);
	}
	
	// Método DELETE para borrar pedido por id
	@DeleteMapping("/{id}")
	public void deletePedido(@PathVariable Long id) {
		pedidoService.deletePedido(id);
	}
	*/
}
