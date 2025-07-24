package br.com.fiap.produtosrepository;

import br.com.fiap.produtos.Categoria;
import java.util.ArrayList;
import java.util.List;

public class CategoriaCollectionRepository {

    private static List<Categoria> categorias;

    static {
        categorias = new ArrayList<>();
        Categoria eletronicos = new Categoria("Eletrônicos");
        Categoria celulares = new Categoria("Celulares");
        Categoria livros = new Categoria("Livros");

        categorias.add(eletronicos);
        categorias.add(celulares);
        categorias.add(livros);
    }

    public static List<Categoria> findAll() {
        return categorias;
    }

    public static Categoria findAll(long id) {
        return categorias.stream()
                         .filter(c -> c.getId().equals(id))
                         .findFirst()
                         .orElse(null);
    }
}
