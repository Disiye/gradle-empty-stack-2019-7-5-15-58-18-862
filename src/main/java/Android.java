public class Android extends Mobile{

    public Android(String name, String color, String brand) {
        super(name, color, brand);
    }

    @Override
    public void Message(String msg) {
        System.out.println("<Android> Message : ["+ msg +"]");
    }

    @Override
    public void limitString(String msg) {
        if(msg.length() > 10){
            System.out.println("<Andriod> Message cannot be sent");
        }else {
            System.out.println("<Android> Message : ["+ msg +"]");
        }
    }
}