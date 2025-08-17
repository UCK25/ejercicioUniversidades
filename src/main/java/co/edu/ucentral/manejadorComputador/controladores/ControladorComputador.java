package co.edu.ucentral.manejadorComputador.controladores;

import co.edu.ucentral.manejadorComputador.entidades.Computador;
import co.edu.ucentral.manejadorComputador.servicios.ServicioComputadores;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/computadores") // 綴りを修正
public class ControladorComputador {
    @Autowired
    private ServicioComputadores servicioComputadores;

    @PostMapping("/")
    public Computador crear(@RequestBody Computador computador) {
        return this.servicioComputadores.registrar(computador);
    }

    @GetMapping("/")
    public List<Computador> consultar() {
        return this.servicioComputadores.consultarTodos();
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        this.servicioComputadores.eliminar(id);
    }
}