package mx.com.moneymakers.DeployProyectoBestFinds.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.moneymakers.DeployProyectoBestFinds.model.Pedido;
import mx.com.moneymakers.DeployProyectoBestFinds.repository.PedidoRepository;

@Service
public class PedidoService {
	
	private final PedidoRepository pedidoRepository;
	
	// Constructor
	@Autowired
	public PedidoService(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}
	
	// Obtener pedido
	public List<Pedido> getAllPedido(){
		return pedidoRepository.findAll();
	}
	
	/*
	// Crear pedido
	public Pedido createPedido(Pedido pedido) {
		return pedidoRepository.save(pedido);
	}
	
	// Crear pedido por Id
	public Pedido createPedido(Long id, Pedido pedido) {
		pedido.setIdPedido(id);
		return pedidoRepository.save(pedido);
	}
	
	// Obtener pedido por Id
	public Pedido getPedidoById(Long id) {
		return pedidoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Pedido con el id " + id + " no encontrado"));
	}
	
	// Actualizar pedido por Id
	public Pedido updatePedido (Long id, Pedido pedidoDetails) {
		Pedido pedido = pedidoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Pedido con el id " + id + " no encontrado"));

		pedido.setIdPedido(pedidoDetails.getIdPedido());
		pedido.setFecha(pedidoDetails.getFecha());
		pedido.setDetalles(pedidoDetails.getDetalles());
		pedido.setFormaPago(pedidoDetails.getFormaPago());
		pedido.setDirecciones_idDireccion(pedidoDetails.getDirecciones_idDireccion());;
		pedido.setCarrito_idCarrito(pedidoDetails.getCarrito_idCarrito());
		pedido.setUsuario_idUsuario(pedidoDetails.getUsuario_idUsuario());
		
		Pedido updatePedido = pedidoRepository.save(pedido);
		return updatePedido;
	
	}
	
	// Borrar pedido por Id
	public void deletePedido(Long id) {
		Pedido pedido = pedidoRepository.findById(id).orElseThrow(() -> new NoSuchElementException("Pedido con el id " + id + " no encontrado"));
		pedidoRepository.delete(pedido);
	}
	*/
	
}
