package recuperacaoFinal.dm;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String endereco;
    private String cep;
    private String numero;
    private String formaPagamento;
    private Double parcelas;
    private Double valorTotal;
    private Double itens;

    public Long getId() {
        return id;
    }

    public Endereco() {
    }

    public String getRua() {
        return endereco;
    }

    public void setRua(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double getParcelas() {
        return parcelas;
    }

    public void setParcelas(Double parcelas) {
        this.parcelas = parcelas;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getItens() {
        return itens;
    }

    public void setItens(Double itens) {
        this.itens = itens;
    }

    public
    Endereco(Long id, String endereco, String cep, String numero, String formaPagamento, Double parcelas, Double valorTotal, Double itens) {
        this.id = id;
        this.endereco = endereco;
        this.cep = cep;
        this.numero = numero;

        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
        this.valorTotal = valorTotal;
        this.itens = itens;
    }

}


