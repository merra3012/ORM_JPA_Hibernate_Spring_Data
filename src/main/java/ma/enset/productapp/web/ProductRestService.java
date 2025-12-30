//EL FELLAH Meryem
package ma.enset.productapp.web;

import ma.enset.productapp.entities.Product;
import ma.enset.productapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// l'utilisation du contrôleur REST pour gérer les requêtes HTTP relatives aux produits.
@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository productRepository;

    // @GetMapping pour gérer les requêtes GET pour récupérer tous les elements ou bien seulon une condition.
    @GetMapping("/products")
    public List<Product> products() {
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product findProduct(@PathVariable Long id) {
        Product product = productRepository.findById(id).orElse(null);
        return product;
    }
}