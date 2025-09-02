package lesson10;

public class Child extends Human {
    private String parentsName = "Ivan Ivanov";

    public Child() {
    }

    public Child(String name, int age, String parentsName) {
        super(name, age);
        setParentsName(parentsName);
    }

    public String getParentsName() {
        return parentsName;
    }

    public void setParentsName(String parentsName) {
        if (parentsName != null && !parentsName.isBlank())
            this.parentsName = parentsName;
    }

    @Override
    public String toString() {
        return "Child - " +
                "parentsName = " + parentsName + " "
                + super.toString();
    }
}
