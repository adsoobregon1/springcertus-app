package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Pago;

@Repository
public interface PagoRepositorio extends JpaRepository<Pago, Long>{

}
