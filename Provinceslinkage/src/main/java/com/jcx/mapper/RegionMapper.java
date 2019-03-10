package com.jcx.mapper;


import com.jcx.domain.Region;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RegionMapper {

    @Select("select region_id, region_name, parent_id from region where parent_id=#{parent_id}")
    public List<Region> findByParentId(int parent_id);
}
