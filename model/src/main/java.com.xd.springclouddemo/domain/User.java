package domain;

import java.io.Serializable;

/**
 * Description
 *
 * @author xd
 * Created on 2020/7/24 22:42
 */
public class User implements Serializable {
    private static final long serialVersionUID = -5334980797651496255L;

    private int id;

    private String name;

    private String idNo;

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

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
}
