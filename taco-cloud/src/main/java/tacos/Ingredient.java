package tacos;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
public class Ingredient {

  @Id
  private String id;
  private String name;
  private Type type;
  private BigDecimal price;

  public Ingredient(String id, String name, Type type) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.price = BigDecimal.ZERO;
  }

  public enum Type {
    WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE, DRINK
  }

}