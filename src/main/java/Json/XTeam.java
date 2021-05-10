package Json;

public class XTeam {
    public String name;
    public String sex;
    public String function;

    public XTeam(String name, String sex, String function) {
        this.name = name;
        this.sex = sex;
        this.function = function;
    }

    public XTeam() {

    }

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

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    @Override
    public String toString() {
        return "XTeam{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", function='" + function + '\'' +
                '}';
    }
}
