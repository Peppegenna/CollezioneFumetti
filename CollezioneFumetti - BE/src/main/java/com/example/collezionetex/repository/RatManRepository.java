package com.example.collezionetex.repository;

import com.example.collezionetex.model.RatMan;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatManRepository extends JpaRepository<RatMan, Long> {
    
    List<RatMan> findByNumeroLikeOrTitoloLike( int n, String t);
    
}
