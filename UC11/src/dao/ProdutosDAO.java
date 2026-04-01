package dao;

import model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutosDAO {

    public void venderProduto(int id) {
        System.out.println("Produto vendido ID: " + id);
    }
    
    
    public List<Produto> listarProdutosVendidos() {
        List<Produto> lista = new ArrayList<>();

        Produto p = new Produto();
        p.setId(1);
        p.setNome("Produto Exemplo");
        p.setPreco(100);
        p.setStatus("Vendido");

        lista.add(p);

        return lista;
    }
}

