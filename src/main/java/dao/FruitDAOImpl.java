package dao;

import pojo.FruitBean;

import java.util.List;

public class FruitDAOImpl extends BaseDAO<FruitBean> implements FruitDAO{

    @Override
    public List<FruitBean> getFruitList() {
        return super.executeQuery("select * from fruit");
    }

    @Override
    public FruitBean getFruitById(Integer id) {
        return super.load("select * from fruit where id = ?",id);
    }

    @Override
    public void updateFruit(FruitBean fruitBean) {
        String sql = "update fruit set name = ? , price = ? , num = ? where id = ?";
        super.executeUpdate(sql,fruitBean.getName(),fruitBean.getPrice(),fruitBean.getNum(),fruitBean.getId());
    }

    @Override
    public void delFruit(Integer id) {
        super.executeUpdate("delete from fruit where id = ?",id);
    }

    @Override
    public void addFruit(FruitBean fruitBean) {
        String sql = "insert into fruit values(0,?,?,?)";
        super.executeUpdate(sql,fruitBean.getName(),fruitBean.getPrice(),fruitBean.getNum());
    }
}
