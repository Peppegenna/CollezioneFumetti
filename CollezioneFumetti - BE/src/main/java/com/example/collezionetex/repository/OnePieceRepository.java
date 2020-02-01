package com.example.collezionetex.repository;

import com.example.collezionetex.model.OnePiece;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnePieceRepository extends JpaRepository<OnePiece, Long>{
    
    List<OnePiece> findByNumeroLikeOrTitoloLike(int n, String t);
    
}
