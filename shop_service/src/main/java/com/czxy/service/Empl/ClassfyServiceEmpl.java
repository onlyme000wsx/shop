package com.czxy.service.Empl;



import com.czxy.dao.ClassifyMapper;
import com.czxy.domain.Classify;

import com.czxy.service.ClassifyService;
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


//                                **
//***********               **       **
//    *                    **         **
//    *                   **            **
//    *                 **                **
//***********          **                   **
//    *               **                      **
//    *              **                        **
//    *           **                            **
//**********                                      **




public class ClassfyServiceEmpl implements ClassifyService {
    @Resource
    private ClassifyMapper classfyMapper;

    @Override
    public List<Classify> findAll() {
        return classfyMapper.selectAll();
    }
}
