import java.util.Date;

public class RH {
    private String nome;
    private String cpf;
    private String telefone;
    private Date data_nasc;
    private Date data_age;
    private String periodo;

    public RH(String nome, String cpf, String telefone, Date data_nasc, Date data_age, String periodo) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nasc = data_nasc;
        this.data_age = data_age;
        this.periodo = periodo;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public Date getData_age() {
        return data_age;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public RH(Date data_age, String periodo) {
        this.data_age = data_age;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "RH{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", data_nasc=" + data_nasc +
                ", data_age=" + data_age +
                ", periodo='" + periodo + '\'' +
                '}';
    }
}
