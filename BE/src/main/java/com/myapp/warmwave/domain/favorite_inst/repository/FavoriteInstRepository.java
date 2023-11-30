package com.myapp.warmwave.domain.favorite_inst.repository;

import com.myapp.warmwave.domain.favorite_inst.entity.FavoriteInst;
import com.myapp.warmwave.domain.user.entity.Individual;
import com.myapp.warmwave.domain.user.entity.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavoriteInstRepository extends JpaRepository<FavoriteInst, Long> {
    List<FavoriteInst> findAllByIndividualUser(Individual individual);

    void deleteByInstitutionUserAndIndividualUser(Institution institution, Individual individual);
}
