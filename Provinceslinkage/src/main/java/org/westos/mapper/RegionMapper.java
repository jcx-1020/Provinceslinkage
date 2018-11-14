package org.westos.mapper;


import org.apache.ibatis.annotations.Select;
import org.westos.domain.Region;

import java.util.List;

public interface RegionMapper {

    @Select("select region_id, region_name, parent_id from region where parent_id=#{parent_id}")
    public List<Region> findByParentId(int parent_id);
}
