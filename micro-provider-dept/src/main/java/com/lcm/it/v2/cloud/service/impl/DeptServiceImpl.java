package com.lcm.it.v2.cloud.service.impl;

import com.lcm.it.v2.cloud.mapper.DeptMapper;
import com.lcm.it.v2.cloud.service.DeptService;
import com.lcm.it.v2.cloud.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper ;

    @Override
    public boolean add(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptMapper.findAll();
    }
}
