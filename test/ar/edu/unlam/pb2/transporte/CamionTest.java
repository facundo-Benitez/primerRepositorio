package ar.edu.unlam.pb2.transporte;

import static org.junit.Assert.*;

import org.junit.Test;

public class CamionTest {

	@Test
	public void queSePuedaCargarPaquetePequenio() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(camion.cargarPaquete(p1, "Hurlingham"));
	}
	
	@Test
	public void queSePuedaCargarDosPaquetePequenios() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(camion.cargarPaquete(p1, "Hurlingham"));
		assertTrue(camion.cargarPaquete(p2, "Hurlingham"));
	}
		
	@Test
	public void queSePuedaCargarMasDeTresDestinosDistintos() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p2 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p3 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p4 = new Paquete(0.1, 0.1, 0.1, 1.0);
		Paquete p5 = new Paquete(0.1, 0.1, 0.1, 1.0);
		assertTrue(camion.cargarPaquete(p1, "Hurlingham"));
		assertTrue(camion.cargarPaquete(p2, "3 de Febrero"));
		assertTrue(camion.cargarPaquete(p3, "San Martín"));
		assertTrue(camion.cargarPaquete(p4, "El Palomar"));
		assertTrue(camion.cargarPaquete(p5, "San Martín"));
	}
	
	@Test
	public void queNoSePuedaCargarVolumenExcedido() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(5.0, 2.0, 2.1, 1.0);
		assertFalse(camion.cargarPaquete(p1, "Hurlingham"));		
	}
	
	@Test
	public void queNoSePuedaCargarVolumenExcedidoEnVariosPaquetes() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(5.0, 2.0, 2.0, 1.0);
		Paquete p2 = new Paquete(0.02, 0.50, 0.50, 1.0);
		assertTrue(camion.cargarPaquete(p1, "Hurlingham"));
		assertFalse(camion.cargarPaquete(p2, "Hurlingham"));		
	}
	
	@Test
	public void queNoSePuedaCargarConPesoExcedidoEnUnPaquete() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(5.0, 2.0, 2.0, 16000.1);
		assertFalse(camion.cargarPaquete(p1, "Hurlingham"));		
	}
	
	@Test
	public void queNoSePuedaCargarConPesoExcedidoEnVariosPaquetes() {
		Camion camion = new Camion();
		Paquete p1 = new Paquete(0.5, 0.5, 0.5, 16000.0);
		Paquete p2 = new Paquete(0.5, 0.5, 0.5, 0.01);
		assertTrue(camion.cargarPaquete(p1, "Hurlingham"));	
		assertFalse(camion.cargarPaquete(p2, "Hurlingham"));		
	}

}
