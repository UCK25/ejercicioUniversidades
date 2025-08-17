package co.edu.ucentral.manejadorComputador.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Table(name = "computadores")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Computador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String marca;
    private String modelo;
    private int capacidadAlmacenamiento;
    private int memoriaRam;
}
