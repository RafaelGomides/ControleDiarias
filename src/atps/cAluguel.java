package atps;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author rafaelgs
 */
public class cAluguel {

    private cQuarto quarto = new cQuarto(0, null, null, null, null, 0, null);

    private Date dataInicial = new Date();
    private Date dataFinal = new Date();
    private BigDecimal valor_ttl0;
    private BigDecimal valor_ttl1;
    private String diarias;
    private int diarias1;

    public BigDecimal calc_diaria_dia(Date dataInicial, Date dataFinal) {
        SimpleDateFormat sdf0 = new SimpleDateFormat("dd/MM/yyyy");
        long aux0 = 24L * 60L * 60L * 1000L;
        long aux1 = ((dataFinal.getTime() - dataInicial.getTime()) / aux0);
//
        System.out.println(quarto.getValor_quarto());
        setValor_ttl0(new BigDecimal(String.valueOf(aux1)));
//
        setDiarias(String.valueOf(aux1));
        setDiarias1(Integer.parseInt(getDiarias()));
        return valor_ttl0;
    }

    public int calc_diaria_hora(String horaInicial, String horaFinal) {
        int aux0 = 0;
        int aux1;
        int aux2;
        aux1 = Integer.parseInt(horaInicial);
        aux2 = Integer.parseInt(horaFinal);
        if (aux2 > 1200) {
            aux0 = aux0 + 1;
            setDiarias1(getDiarias1() + aux0);
        }
        return getDiarias1();
    }

    public BigDecimal calc_sub_ttl(String VlOr, String VlCa, String VlCh) {

        BigDecimal aux0 = new BigDecimal(VlOr);
        BigDecimal aux1 = new BigDecimal(VlCa);
        BigDecimal auxTTl1 = new BigDecimal("00.00");
        BigDecimal aux2 = new BigDecimal(VlCh);
        BigDecimal auxTTl2 = new BigDecimal("00.00");
        BigDecimal ret = new BigDecimal("00.00");

        auxTTl1 = aux0.multiply(aux1);

        auxTTl2 = aux0.multiply(aux2);
        
        auxTTl1 = auxTTl1.add(auxTTl2);
        ret = aux0.add(auxTTl1);

        return ret;

    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public BigDecimal getValor_ttl1() {
        return valor_ttl1;
    }

    public void setValor_ttl1(BigDecimal valor_ttl1) {
        this.valor_ttl1 = valor_ttl1;
    }

    public BigDecimal getValor_ttl0() {
        return valor_ttl0;
    }

    public void setValor_ttl0(BigDecimal valor_ttl0) {
        this.valor_ttl0 = valor_ttl0;
    }

    public String getDiarias() {
        return diarias;
    }

    public void setDiarias(String diarias) {
        this.diarias = diarias;
    }

    public int getDiarias1() {
        return diarias1;
    }

    public void setDiarias1(int diarias1) {
        this.diarias1 = diarias1;
    }

    public cQuarto getQuarto() {
        return quarto;
    }

    public void setQuarto(cQuarto quarto) {
        this.quarto = quarto;
    }
}
