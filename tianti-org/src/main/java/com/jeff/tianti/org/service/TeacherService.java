package com.jeff.tianti.org.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

import com.jeff.tianti.common.entity.PageModel;
import com.jeff.tianti.org.dao.TeacherDao;
import com.jeff.tianti.org.dao.TeacherRepository;
import com.jeff.tianti.org.dto.UserQueryDTO;
import com.jeff.tianti.org.entity.Teacher;
import com.jeff.tianti.org.entity.User;

@Service
public class TeacherService {
	@Autowired
	private TeacherDao teacherdao;

	/**
	 * @param teacher
	 *            接受前端传来的老师
	 **/
	public void save(String teacherString) {

		// TODO: 根据是否有id来判断是添加还是修改
		Gson gson = new Gson();
		Teacher teacher = gson.fromJson(teacherString, Teacher.class);

		if (teacher.getID() == NULL) {
			/* 添加 */
			TeacherRepository.save(teacher);
		}
	}

	/**
	 * @param current
	 *            当前页
	 * @param size
	 *            每页多少条记录
	 **/
	public List<Map<String, Object>> searchTeacherList(int current, int size) {
		// TODO: 逻辑
		return null;

	}

	public Page<Teacher> listByPageable(
			@PageableDefault(value = 15, sort = { "id" }, direction = Sort.Direction.DESC) Pageable pageable) {

		return TeacherRepository.findAll(pageable);
	}

	/**
	 * @param id
	 *            要查询导师的id
	 * @param size
	 *            每页多少条记录
	 **/
	public Map<String, Object> searchTeacher(String id) {
		// TODO: 逻辑
		return null;
	}
}
