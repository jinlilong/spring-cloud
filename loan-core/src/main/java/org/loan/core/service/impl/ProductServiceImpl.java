/**
 * Copyright (c) 2018 All Rights Reserved.
 */
package org.loan.core.service.impl;

import java.util.HashMap;
import java.util.List;

import org.loan.core.dao.ClProductDao;
import org.loan.core.domain.ClProductEntity;
import org.loan.core.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author jinlilong
 * @version $Id: ProductServiceImpl.java, v 0.1 2018年7月20日 下午1:39:33 jinlilong Exp $
 */
@Service("productService")
public class ProductServiceImpl implements ProductService {

    /**  */
    @Autowired
    private ClProductDao clProductDao;

    /** 
     * @see org.loan.core.service.ProductService#queryProduct()
     */
    @Override
    public List<ClProductEntity> queryProduct() {
        return clProductDao.queryList(new HashMap<>());
    }

}
