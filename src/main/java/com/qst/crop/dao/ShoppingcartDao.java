package com.qst.crop.dao;

import com.qst.crop.entity.Shoppingcart;
import com.qst.crop.model.ShoppingModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface ShoppingcartDao {

    int deleteByPrimaryKey(Integer shoppingId);

    int insertSelective(Shoppingcart shoppingcart);

    List<ShoppingModel> selectByShopping(Shoppingcart shoppingcart);

    int updateByPrimaryKeySelective(Shoppingcart shoppingcart);

}