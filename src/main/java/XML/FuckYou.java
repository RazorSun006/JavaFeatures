package XML;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.List;

@XmlRootElement
public class FuckYou {
    @XmlAttribute
    public String angry;
    @XmlElement
    public List<GXML> list;



    @XmlTransient
    public String getAngry() {
        return angry;
    }

    public void setAngry(String angry) {
        this.angry = angry;
    }

    @XmlTransient
    public List<GXML> getList() {
        return list;
    }


    public void setList(List<GXML> list) {
        this.list = list;
    }
}
