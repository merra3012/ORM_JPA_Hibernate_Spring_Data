// EL FELLAH Meryem
package ma.enset.productapp.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

//J ai utilise icic les annotations Lombok pour générer automatiquement les getters, setters, constructeurs, etc.... comme j'ai fait deja dans le TP precedent.
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int quantity;
}