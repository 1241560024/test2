package com.itheima.service.impl;

import com.itheima.dao.itemsDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class itemsServiceImpl implements ItemsService {
    @Autowired
    private itemsDao itemsDao;
    public Items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
