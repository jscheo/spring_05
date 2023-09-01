package com.icia.demo.repository;

import com.icia.demo.dto.DemoDTO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DemoDBRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public void reqdb1(DemoDTO demoDTO) {
        sql.insert("Demo.save", demoDTO);
    }

    public List<DemoDTO> findAll() {
        return sql.selectList("Demo.findAll");
    }

    public DemoDTO findById(Long id) {
        return  sql.selectOne("Demo.findById", id);
    }
}
