package org.westos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.westos.domain.Region;
import org.westos.service.RegionService;

import java.util.List;

@Controller
public class RegionController {

    @Autowired
    private RegionService regionService;


    @RequestMapping("/findByParentId")
    @ResponseBody
    public List<Region> findByParentId(int parent_id){
        return regionService.findByParentId(parent_id);
    }
}
