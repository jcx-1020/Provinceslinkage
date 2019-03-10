package com.jcx.controller;

import com.jcx.domain.Region;
import com.jcx.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
