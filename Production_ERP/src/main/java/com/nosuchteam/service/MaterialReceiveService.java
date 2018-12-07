package com.nosuchteam.service;

import com.nosuchteam.bean.Material;
import com.nosuchteam.bean.MaterialReceive;

import java.util.List;

public interface MaterialReceiveService {
    List<MaterialReceive> findAllMaterialReceive();

    Material getMaterialById(String materialId);

    boolean insert(MaterialReceive materialReceive);

    boolean update(MaterialReceive materialReceive);

    boolean delectById(String id);

    List<MaterialReceive> searchByReceiveId(String searchValue);

    List<MaterialReceive> serachByMaterialId(String searchValue);
}