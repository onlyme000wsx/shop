package com.czxy.service.Empl;

import com.czxy.dao.ClassfyMapper;
import com.czxy.domain.Classfy;
import com.czxy.service.ClassfyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author libin
 * @Version v 1.0
 * @Date 2019/7/30
 */
@Service
@Transactional
public class ClassfyServiceEmpl implements ClassfyService {
    @Resource
    private ClassfyMapper classfyMapper;

    @Override
    public List<Classfy> findAll() {
        return classfyMapper.selectAll();
    }
}
