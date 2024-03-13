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
@Table(name = "TB_SOLICITANTE")
public class Solicitante {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SOLICITANTE")
    @SequenceGenerator(
            name = "SQ_SOLICITANTE",
            sequenceName = "SQ_SOLICITANTE",
            allocationSize = 1
    )
    @Column(name = "ID_SOLICITANTE")
    private Long id;

    @Column(name = "NM_SOLICITANTE")
    private String nome;
}
