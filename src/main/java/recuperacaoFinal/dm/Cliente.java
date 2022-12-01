package recuperacaoFinal.dm;

import jakarta.persistence.Entity;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String enderco;
    private Double cep;
    private Double numero;
    private String formaPagamento;
    private Double parcels;
    private Double valorTotal;
    private Double intens;

    public Cliente(Long id, String enderco, Double cep, Double numero, String formaPagamento, Double parcels, Double valorTotal, Double intens) {
        this.id = id;
        this.enderco = enderco;
        this.cep = cep;
        this.numero = numero;
        this.formaPagamento = formaPagamento;
        this.parcels = parcels;
        this.valorTotal = valorTotal;
        this.intens = intens;
    }

    public Long getId() {
        return id;
    }



    public String getEnderco() {
        return enderco;
    }

    public void setEnderco(String enderco) {
        this.enderco = enderco;
    }

    public Double getCep() {
        return cep;
    }

    public void setCep(Double cep) {
        this.cep = cep;
    }

    public Double getNumero() {
        return numero;
    }

    public void setNumero(Double numero) {
        this.numero = numero;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public Double getParcels() {
        return parcels;
    }

    public void setParcels(Double parcels) {
        this.parcels = parcels;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getIntens() {
        return intens;
    }

    public void setIntens(Double intens) {
        this.intens = intens;
    }

    public Cliente() {
    }

}
