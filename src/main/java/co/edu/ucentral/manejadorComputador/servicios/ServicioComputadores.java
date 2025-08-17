package co.edu.ucentral.manejadorComputador.servicios;

import co.edu.ucentral.manejadorComputador.entidades.Computador;
import co.edu.ucentral.manejadorComputador.repositorios.ComputadorRepositorio;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class ServicioComputadores {
    @Autowired
    private ComputadorRepositorio repositorio;

    public Computador registrar(Computador computador) {
        return repositorio.save(computador);
    }

    public List<Computador> consultarTodos() {
        return repositorio.findAll();
    }

    public void eliminar(Long id) {
        repositorio.deleteById(id);
    }
}
