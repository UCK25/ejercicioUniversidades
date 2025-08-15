package co.edu.ucentral.manejadorUniveridades.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "computadoras")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class DatosDeComputador {
    @Id
    private String cpu;
    private String marca;
    private String modelo;
    private String capacidadAlmacenamiento;
    private String memoriaRam;
}
