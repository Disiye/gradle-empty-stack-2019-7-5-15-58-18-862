public class Mobile{
    private String name;
    private String color;
    private String brand;

    Mobile(String name, String color, String brand){
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public void Message(String msg){
        System.out.println("Message : ["+ msg +"]");
    }

    public String toString(){
        return String.format("name:[%s], color:[&s], brand:[%s]",getName(),getColor(),getBrand());
    }

    public void limitString(String msg){
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }
}