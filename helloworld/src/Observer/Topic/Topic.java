/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.Topic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Topic {
    List<ITopic> topics = new ArrayList();
    List<String> dsTin = new ArrayList();
    public void attach(ITopic t){
        topics.add(t);
    }
    public void detach(ITopic t){
        if(topics.contains(t))
            topics.remove(t);
    }

    public void taoTin(String tin){
        dsTin.add(tin);
        for (ITopic t: topics){
            t.update(tin, true);
        }
    }

    public void capNhatTin(String tinCu, String tinMoi){
        if (dsTin.contains(tinCu)){
            tinCu = tinMoi;
            for (ITopic t: topics){
                t.update(tinMoi, false);
            }
        }

    }

    public static interface ITopic{
        void update(String tin, boolean them);
    }
}
    