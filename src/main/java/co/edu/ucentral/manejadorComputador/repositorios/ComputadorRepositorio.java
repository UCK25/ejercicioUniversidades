package co.edu.ucentral.manejadorComputador.repositorios;

import co.edu.ucentral.manejadorComputador.entidades.Computador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputadorRepositorio extends JpaRepository<Computador, Long>{
}