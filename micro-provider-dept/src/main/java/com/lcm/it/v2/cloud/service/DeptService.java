package com.lcm.it.v2.cloud.service;

import com.lcm.it.v2.cloud.vo.Dept;

import java.util.List;

public interface DeptService {

    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
