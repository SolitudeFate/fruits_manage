package pojo;

public class FruitBean {
    private Integer id;
    private String name;
    private Integer price;
    private Integer num;

    @Override
    public String toString() {
        return "FruitBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public FruitBean(Integer id, String name, Integer price, Integer num) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public FruitBean() {
    }
}
