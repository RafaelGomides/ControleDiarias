package atps;

import java.math.BigDecimal;

/**
 *
 * @author rafaelgs
 */
public class cQuarto {

    private int codigo;
    private String descricao;
    private String numero;
    private String andar;
    private String tipo;
    private int cod_cliente;
    private BigDecimal valor_quarto;

    public cQuarto(int codigo, String descricao, String numero, String andar, String tipo,int cod_cliente, BigDecimal valor_quarto) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.numero = numero;
        this.andar = andar;
        this.tipo = tipo;
        this.cod_cliente = cod_cliente;
        this.valor_quarto = valor_quarto;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValor_quarto() {
        return valor_quarto;
    }

    public void setValor_quarto(BigDecimal valor_quarto) {
        this.valor_quarto = valor_quarto;
    }

    @Override
    public String toString() {
        return "COD:"+getCodigo()+""
                + "\nDES:"+getDescricao()+""
                + "\nNUM:"+getNumero()+""
                + "\nAND:"+getAndar()+""
                + "\nTIP:"+getTipo()+""
                + "\nCCL:"+getCod_cliente()+""
                + "\nVLR:"+getValor_quarto();
    }

    public int getCod_cliente() {
        return cod_cliente;
    }

    public void setCod_cliente(int cod_cliente) {
        this.cod_cliente = cod_cliente;
    }
    
    
}
