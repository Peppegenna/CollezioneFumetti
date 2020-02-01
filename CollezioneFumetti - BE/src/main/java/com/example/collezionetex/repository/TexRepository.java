package com.example.collezionetex.repository;

import com.example.collezionetex.model.Tex;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TexRepository extends JpaRepository<Tex, Long>  {
    
    List<Tex> findByNumeroLikeOrTitoloLike(int n, String t);
    
}
