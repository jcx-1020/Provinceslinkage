package org.westos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.westos.domain.Region;
import org.westos.mapper.RegionMapper;

import java.util.List;

@Service
public class RegionService {

    @Autowired
    private RegionMapper regionMapper;

    public List<Region> findByParentId(int parent_id){
        return regionMapper.findByParentId(parent_id);
    }
}
