package ee.shop.repairback.domain.repairsubcategory;

import ee.shop.repairback.domain.repairmaincategory.RepairMainCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "repair_sub_category", schema = "repair")
public class RepairSubCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "repair_main_category_id", nullable = false)
    private RepairMainCategory repairMainCategory;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

}