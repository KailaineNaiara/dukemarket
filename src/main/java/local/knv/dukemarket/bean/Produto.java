/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package local.knv.dukemarket.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kailaine
 */

public class Produto {
    
    private int id;
    private String descricao;
    private String codBarras;
    private double qtd;
    private double ValorCompra;
    private double ValorVenda;
    private Calendar dataCadastro;

    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public double getValorCompra() {
        return ValorCompra;
    }

    public void setValorCompra(double ValorCompra) {
        this.ValorCompra = ValorCompra;
    }

    public double getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(double ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public String getDataCadastro() {
        if (this.dataCadastro != null ){
            SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
            return sdf.format (this.dataCadastro.getTime());
        } else {
            return "";
        }
    }

    public void setDataCadastro(String strDataCadastro) {
        try {
            this.dataCadastro = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
            this.dataCadastro.setTime(sdf.parse (strDataCadastro));
        } catch (ParseException ex ){
            Logger.getLogger (Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public String toString (){
        return String.format ("%3d | %15s | %-30s | %10.2f | %10.2f | %10.2f | %10s ", this.id,
        this.codBarras, this.descricao, this.qtd, this.ValorCompra,
        this.ValorCompra, this.getDataCadastro());
    }

    
    
}
