package ee.shop.repairback.domain.year;

import ee.shop.repairback.domain.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Year;
import java.util.List;

public interface YearRepository extends JpaRepository<Year, Integer> {


    //@Query("select m from Model m where m.brand.id = ?1 order by m.name") //vaja muuta?
    //List<Year> findYearsBy (Integer yearId);
}