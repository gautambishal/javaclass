package com.example.demoday2.service;

import com.example.demoday2.model.Institute;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstitueServiceImpl implements InstituteService{
    @Override
    public List<Institute> instituteList() {
        Institute institute = new Institute(2,"stratitude","texas","235jh");
        Institute institute1 = new Institute(3,"abcd","texas","uios");
        Institute institute2 = new Institute(5,"uio","texas","98jsjs");
        Institute institute3 = new Institute(7,"standford","texas","56");

        List<Institute> instituteList = new ArrayList<>();
        instituteList.add(institute);
        instituteList.add(institute1);
        instituteList.add(institute2);
        instituteList.add(institute3);

        return instituteList;
    }
}
