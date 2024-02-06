package App;

public class Driver implements Comparable<Driver>{
    private int id;
    private String name;
    private int age;

    public Driver(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Driver() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "App.Driver{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Driver o) {
        int ageDiff = Integer.compare(age,o.age);
        if(ageDiff !=0)
            return ageDiff;
        /**int nameDiff = name.compareTo(o.name);
        if (nameDiff != 0)
            return nameDiff;**/
        return name.compareTo(o.name);
    }
}
