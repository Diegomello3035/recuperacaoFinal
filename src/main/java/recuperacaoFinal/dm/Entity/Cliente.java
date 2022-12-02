package recuperacaoFinal.dm.Entity;



import jakarta.persistence.*;

import recuperacaoFinal.dm.Itens.Itens;
import org.hibernate.annotations.Cascade;
import org.springframework.data.repository.cdi.Eager;


import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String endereco;
    private String cep;
    private Integer numero;
    private String formaDePagamento;
    private Integer parcelas;
    private Double valortotal;
    @OneToMany(cascade = CascadeType.ALL)
    List<Itens> itens;

    public Cliente() {
    }

    public Cliente(Long id, String endereco, String cep, Integer numero, String formaDePagamento, Integer parcelas,Double valortotal, List<Itens> itens) {
        this.id = id;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;
        this.formaDePagamento = formaDePagamento;
        this.parcelas = parcelas;
        this.itens = itens;
        this.valortotal = valortotal;

    }

    public Long getId() {
        return id;
    }



    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(String formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

    public Double getValortotal() {
        return valortotal;
    }

    public void setValortotal(Double valortotal) {
        this.valortotal = valortotal;
    }
}

