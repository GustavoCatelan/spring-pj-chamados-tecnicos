package br.com.fiap.springpjchamadostecnicos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_ESPECIALIDADE")
public class Especialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESPECIALIDADE")
    @SequenceGenerator(
            name = "SQ_ESPECIALIDADE",
            sequenceName = "SQ_ESPECIALIDADE",
            allocationSize = 1
    )
    @Column(name = "ID_ESPECIALIDADE")
    private Long id;

    @Column(name = "NM_ESPECIALIDADE")
    private String nome;
}
