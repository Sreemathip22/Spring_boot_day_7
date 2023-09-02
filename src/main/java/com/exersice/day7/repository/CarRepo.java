package com.exersice.day7.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.exersice.day7.model.CarEntity;

import jakarta.transaction.Transactional;

public interface CarRepo extends JpaRepository<CarEntity, Integer>{
	@Query(value="select *from cartable where id=:id or name=:name",nativeQuery=true)
	public List<CarEntity>getCarInfo(@Param("id") int id,@Param("name") String carName);
	
	@Modifying
	@Transactional
	@Query(value="delete from cartable where id=:id", nativeQuery=true)
	public int deleteCarinfo(@Param("id")int id);
	
	@Modifying
	@Transactional
	@Query(value="update cartable set id=?1 where id=?2",nativeQuery=true)
	public int updateCarInfo(int newid,int oldid);
}
