package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {
    int adminId;

    public SlackAdminUser( String name, String status, int adminId) {
        this.name=name;
        this.status=status;
        this.adminId = adminId;

    }

    public void sendAChannelMessage () {
        System.out.println(name + " can send a Channel Message");
    }
    public void deleteMessage () {
        System.out.println(name + " can delete messages");
    }
    public void addChanel () {
        System.out.println(name + " can add chanel");
    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId='" + adminId + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public static void main(String[] args) {
        SlackAdminUser user1 = new SlackAdminUser("Akbar", "Horse Release", 101);

        //INHERITED METHODS
        user1.sendMessage();
        user1.callSomeOne();
        user1.addEmoji();
        //other methods
        user1.sendAChannelMessage();
        user1.deleteMessage();
        user1.addChanel();
    }
}
