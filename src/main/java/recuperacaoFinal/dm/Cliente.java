package recuperacaoFinal.dm;


@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Cliente() {
    }

    public Cliente(Long id,List<Endereco> enderecos) {
        this.id = id;

        this.enderecos = enderecos;
    }

    public Long getId() {
        return id;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

}
