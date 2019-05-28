package com.service.impl;

import com.dao.OutersMapper;
import com.pojo.Outers;
import com.service.IOutersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutersServiceImpl implements IOutersService {

    @Autowired
    private OutersMapper outersMapper;


    @Override
    public List<Outers> findAllOuters() {
     List<Outers> outers=outersMapper.selectAll();
     return outers;
    }
}
