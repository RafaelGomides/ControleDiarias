package atps;

import java.util.Date;

/**
 *
 * @author rafaelgs
 */
public class cPessoa {

    private int codigo;
    private String nome;
    private String rg;
    private String cpf;
    private Date datanasc = new Date();
    private String telefone;
    private cDados dados = new cDados();

    public cPessoa(int codigo, String nome, String rg, String cpf, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    @Override
    public String toString() {
        return "#"+getCodigo()+" ..... Nome: "+getNome();
    }

    public cDados getDados() {
        return dados;
    }

    public void setDados(cDados dados) {
        this.dados = dados;
    }
    
}
