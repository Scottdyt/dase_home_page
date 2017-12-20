package com.jeff.tianti.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeff.tianti.common.dao.CommonDao;
import com.jeff.tianti.org.entity.Resource;
import com.jeff.tianti.org.entity.Teacher;


public interface TeacherRepository extends JpaRepository<Teacher, Long> {

	Teacher findById(Long id); 

	@Modifying 
	@Query("update teacher u set u.content = ?1 where u.id = ?2") 
	void updateTeacher(String content, long id);
	
	
	@Modifying 
	@Query("update teacher u set u.content = ?1 where u.id = ?2") 
	public int updateContent(String content, long id);
	
	@Query("DELETE FROM teacher u WHERE u.id=?1")
	@Modifying
	@Transactional
	void deleteById(long id);

}

