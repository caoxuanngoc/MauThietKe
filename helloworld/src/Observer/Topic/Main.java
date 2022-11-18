/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Observer.Topic;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Topic topic = new Topic();
        TVB b = new TVB(topic);
        String t1 = "An sang";
        topic.taoTin(t1);
        topic.capNhatTin(t1,"An trua");
        topic.taoTin("Di ngu");
        b.huyDangKy(topic);
        topic.taoTin("Di ca phe");
        TVA a = new TVA(topic);
        topic.taoTin("An toi");
        //System.out.println(topic);
    }
    
}
