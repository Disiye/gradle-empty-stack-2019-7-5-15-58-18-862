public class Iphone extends Mobile{

    public Iphone(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void Message(String msg) {
        System.out.println("<iPhone> Message : ["+ msg +"]");
    }

    @Override
    public void limitString(String msg) {
        if(msg.length() > 10){
            System.out.println("<iPhone> Message cannot be sent");
        }else{
            System.out.println("<iPhone> Message : ["+ msg +"]");
        }
    }
}