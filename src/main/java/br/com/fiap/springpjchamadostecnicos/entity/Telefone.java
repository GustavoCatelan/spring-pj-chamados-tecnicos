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
@Table(name = "TB_TELEFONE")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TELEFONE")
    @SequenceGenerator(
            name = "SQ_TELEFONE",
            sequenceName = "SQ_TELEFONE",
            allocationSize = 1
    )
    @Column(name = "ID_TELEFONE")
    private Long id;

    @Column(name = "DDI_TELEFONE")
    private String ddi;

    @Column(name = "DDD_TELEFONE")
    private String ddd;

    @Column(name = "NUM_TELEFONE")
    private String numero;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "SOLICITANTE",
            referencedColumnName = "ID_SOLICITANTE",
            foreignKey = @ForeignKey(
                    name = "FK_TELEFONE_SOLICITANTE"
            )
    )
    private Solicitante solicitante;
}
