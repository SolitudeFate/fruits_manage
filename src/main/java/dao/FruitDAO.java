package dao;

import pojo.FruitBean;

import java.util.List;

public interface FruitDAO {
    //获取所有水果信息
    List<FruitBean> getFruitList();

    //根据id获取对应的水果的信息
    FruitBean getFruitById(Integer id);

    //修改指定的库存记录
    void updateFruit(FruitBean fruitBean);

    //删除指定水果信息
    void delFruit(Integer id);

    //添加水果信息
    void addFruit(FruitBean fruitBean);
}
