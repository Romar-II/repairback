package ee.shop.repairback.domain.repairmaincategory;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "repair_main_category", schema = "repair")
public class RepairMainCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;


    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

}