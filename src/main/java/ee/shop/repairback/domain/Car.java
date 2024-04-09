package ee.shop.repairback.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "car", schema = "repair")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "reg_number", nullable = false)
    private String regNumber;

    @NotNull
    @Column(name = "user_id", nullable = false)
    private Integer userId;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "model_year_id", nullable = false)
    private ModelYear modelYear;

}