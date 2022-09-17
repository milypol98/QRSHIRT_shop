package pl.milypol.qrshirt_shop.entity;

import lombok.Data;
import pl.milypol.qrshirt_shop.enums.Size;

import javax.persistence.*;

@Data
@Entity
public class TShirt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Size size;
    private Long price;
    @ManyToOne
    private User user;
    private String description;
}
