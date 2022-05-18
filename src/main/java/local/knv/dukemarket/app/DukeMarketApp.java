/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package local.knv.dukemarket.app;

import local.knv.dukemarket.bean.Produto;
import local.knv.dukemarket.dao.ProdutoDAO;

/**
 *
 * @author devsys-b
 */

public class DukeMarketApp {
    public static void main(String[] args) {
        
     Produto pAux;
     ProdutoDAO pDAO = new ProdutoDAO();
     
     //Teste de inclusão de produto
     
     pAux = new Produto ();
     pAux.setCodBarras ("123456");
     pAux.setQtd (50);
     pAux.setDescricao ("Mouse lógico blurtooth");
     pAux.setValorCompra (80.00);
     pAux.setValorVenda (167.00);
     
     pDAO.create (pAux);
    
     pAux = new Produto ();
     pAux.setCodBarras ("654321");
     pAux.setQtd (80);
     pAux.setDescricao ("Teclado UBS gamer");
     pAux.setValorCompra (104.00);
     pAux.setValorVenda (220.00);
     
     pDAO.create (pAux);
     
     pAux = new Produto ();
     pAux.setCodBarras ("678910");
     pAux.setQtd (110);
     pAux.setDescricao ("Microcomputador Dell");
     pAux.setValorCompra (2400.00);
     pAux.setValorVenda (3200.00);
     
     pAux = new Produto ();
     pAux.setCodBarras ("891011");
     pAux.setQtd (50);
     pAux.setDescricao ("Notebook Inspiron");
     pAux.setValorCompra (2380.00);
     pAux.setValorVenda (2947.00);
     
     pDAO.create (pAux);
     
     
    //TESTE DE EXCLUSÃO DO PRODUTO
    //pDAO.delete(3);
     
    
  
    //    Lista Geral
    //     
    //    pDAO.getResults().forEach(p -> {
    //      System.out.println(p.toString());
    //    });



    //    TESTE DE ALTERAÇÃO DO PRODUTO
    //    pAux = pDAO.getResultById(1);
    //    pAux .setQtd(100);
    //    pDAO.update (pAux);
    //    
    //Lista geral
    
    pDAO.getResults().forEach (p -> {
        System.out.println(p.toString());
    });
    
    }
}



    
    
     
     

