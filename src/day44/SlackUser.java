package day44;

public class SlackUser {
    /*
    Create a class called SlackUser
attributes : name  ,  status (make it protected)
behaviours : sendMessage, callSomeone,  addEmoji
    Create 1 subClass SlackAdminUser
attribute : adminId
behaviour : sendAtChannelMessage, deleteMessage, addChannel
toString method
constructor : 3 argument constructor to set all fields value
     */

    protected String name;
    protected String status;

    public void sendMessage () {
        System.out.println(name + " can send a message");
    }
    public void callSomeOne (){
        System.out.println(name + " can call some one");
    }
    public void addEmoji () {
        System.out.println(name + " can add Emoji");
    }
}
