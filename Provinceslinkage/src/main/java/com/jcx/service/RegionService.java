package com.jcx.service;

import com.jcx.domain.Region;
import com.jcx.mapper.RegionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionMapper regionMapper;

    public List<Region> findByParentId(int parent_id){
        return regionMapper.findByParentId(parent_id);
    }
}
