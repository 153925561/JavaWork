package com.service.impl;

import com.dao.BuildingMapper;
import com.pojo.Building;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BuildingServiceImpl implements IBuildingService{
    @Autowired
    private BuildingMapper buildingMapper;
    @Override
    public List<Building> findAllBuilding() {
        List<Building> buildings=buildingMapper.selectAll();
        return buildings;
    }
}
