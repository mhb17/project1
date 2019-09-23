package model;

import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

//import javax.persistence.Entity;
//import javax.persistence.Id;
@Component
//@Entity
public class Product {
   // @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;

    public Product() {
    }

    public Product(String name, String desc) {
        this.setName(name);
        this.setDesc(desc);

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "id : "+id +" name: "+name+" description: "+desc;
    }
}
