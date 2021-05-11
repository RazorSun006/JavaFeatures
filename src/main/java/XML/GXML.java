package XML;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class GXML {
    String name;
    String sex;
    String usage;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public GXML() {

    }

    public GXML(String name, String sex, String usage) {
        this.name = name;
        this.sex = sex;
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "GXML{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", usage='" + usage + '\'' +
                '}';
    }
}
