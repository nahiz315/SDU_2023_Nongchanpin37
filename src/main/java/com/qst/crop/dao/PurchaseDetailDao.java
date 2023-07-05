package com.qst.crop.dao;

import com.qst.crop.entity.PurchaseDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface PurchaseDetailDao {

    int insertSelective(PurchaseDetail record);

    List<PurchaseDetail> selectByPurchaseId(@Param("purchaseId")Integer purchaseId);

}