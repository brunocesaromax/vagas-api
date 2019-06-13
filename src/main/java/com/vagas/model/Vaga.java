package com.vagas.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto incremento do banco de dados
    private Long id;

    @NotEmpty
    @Size(max = 100)
    @Column(name = "empresa")
    private String empresa;

    @NotEmpty
    @Size(max = 200)
    private String descricao;

    @Min(0)
    private BigDecimal salario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vaga vaga = (Vaga) o;
        return id.equals(vaga.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
