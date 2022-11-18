/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.Topic;

/**
 *
 * @author DELL
 */

public class TVB implements Topic.ITopic{
    Topic topic;

    public TVB(Topic topic) {
        this.topic = topic;
        topic.attach(this);
    }
    void huyDangKy(Topic topic){
        topic.detach(this);
    }
    public String inDsTin(){
        int i = 0;
        StringBuilder builder = new StringBuilder();
        for (String item: topic.dsTin){
            builder.append("\nTin số "+ ++i + ": ");
            builder.append(item);
        }
        return builder.toString();
    }
    @Override
    public void update(String tin, boolean them) {
        if (them){
            System.out.println("Thông tin mới B: "+this.inDsTin());
        }else
        {
            System.out.println("Cập nhật tin B: "+tin);
        }
    }
}