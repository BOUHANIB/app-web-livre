package ma.emsi.db_livre.repositories;

import ma.emsi.db_livre.entities.Livre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface LivreRepository extends JpaRepository<Livre,Long> {
    Page<Livre> findByTitreContains(String kw, Pageable pageable);

    List<Livre> findByExposant_ExposantId(Long exposantId);

}
