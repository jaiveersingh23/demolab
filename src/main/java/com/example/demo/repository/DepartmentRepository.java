Using JdbcTemplate for direct SQL operations:

package com.example.demo.repository;

import com.example.demo.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Department> findAll() {
        String sql = "SELECT * FROM department";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Department.class));
    }

    public Department findById(int dno) {
        String sql = "SELECT * FROM department WHERE dno = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Department.class), dno);
    }

    public int save(Department dept) {
        String sql = "INSERT INTO department (dno, dname, hod, year) VALUES (?, ?, ?, ?)";
        return jdbcTemplate.update(sql, dept.getDno(), dept.getDname(), dept.getHod(), dept.getYear());
    }

    public int update(Department dept) {
        String sql = "UPDATE department SET dname = ?, hod = ?, year = ? WHERE dno = ?";
        return jdbcTemplate.update(sql, dept.getDname(), dept.getHod(), dept.getYear(), dept.getDno());
    }

    public int delete(int dno) {
        String sql = "DELETE FROM department WHERE dno = ?";
        return jdbcTemplate.update(sql, dno);
    }
}
