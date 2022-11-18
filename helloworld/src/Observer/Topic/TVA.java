/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.Topic;

/**
 *
 * @author DELL
 */
public class TVA implements Topic.ITopic{
    Topic topic;

    public TVA(Topic topic) {
        this.topic = topic;
        topic.attach(this);
    }

    void huyDangKy(Topic topic){
        topic.detach(this);
    }

    @Override
    public void update(String tin, boolean them) {
        if (them){
            System.out.println("Thêm tin A: " + tin);
        }else System.out.println(("Cập nhật A: " + tin));
    }
}