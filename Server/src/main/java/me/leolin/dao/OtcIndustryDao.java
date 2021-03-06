package me.leolin.dao;

import me.leolin.data.entity.OtcIndustryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author leolin
 */
public interface OtcIndustryDao extends JpaRepository<OtcIndustryEntity, String> {
    @Query("select e.code from OtcIndustryEntity e")
    List<String> getAllIndustryCodes();
}
