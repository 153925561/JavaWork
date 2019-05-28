package com.service.impl;

import com.dao.MissingMapper;
import com.pojo.Missing;
import com.service.IMissingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MissingServiceImpl implements IMissingService {

    @Autowired
    private MissingMapper missingMapper;

    @Override
    public List<Missing> findAllMissing() {
        List<Missing> missings=missingMapper.selectAll();
        return missings;
    }

}
