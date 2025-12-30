// EL FELLAH Meryem
// J'ai bien utilise le mot enset pour juste eviter les erreurs innattendues afin de ne pas perdre le temps sur des banalites et pour ne pas confliter avec d'autres projets
package ma.enset.productapp.repository;
import ma.enset.productapp.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

// ici j'ai cree le repository pour l'entite Product en etendant JpaRepository afin dexploiter des methodes CRUD predefinies pour gerer les entites
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContains(String mc);
    List<Product> findByPriceGreaterThan(double price);
    @Query("select p from Product p where p.name Like :x")
    List<Product> search(@Param("x") String mc);
    @Query("select p from Product p where p.price>:x")
    List<Product> searchByPrice(@Param("x") double price);
}
