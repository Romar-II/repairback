package ee.shop.repairback.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "model_year", schema = "repair")
public class ModelYear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "model_id", nullable = false)
    private Model model;

    @NotNull
    @Column(name = "number", nullable = false)
    private Integer number;

    @NotNull
    @Column(name = "repair_multiplier", nullable = false)
    private Integer repairMultiplier;

}