package adv.web.hcc;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(
        name = "flower"
)
public class Flower {
    @Id
    @Column(
            name = "id"
    )
    public String id;
    @Column(
            name = "img"
    )
    public String img;
    @Column(
            name = "fname"
    )
    public String fname;
    @Column(
            name = "quantity"
    )
    public int quantity;

    public Flower() {
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return this.fname;
    }

    public void setName(String name) {
        this.fname = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
