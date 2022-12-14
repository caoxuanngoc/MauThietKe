/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Composite;

/**
 *
 * @author DELL
 */
import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstractFile{
    List<AbstractFile> abstractFileList = new ArrayList<AbstractFile>();
    public Folder(String ten, String ngay) {
        super(ten, ngay);
    }

    @Override
    public String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(preStr).append(ten);
        for (AbstractFile f: abstractFileList){
            f.preStr = this.preStr + "..";
            builder.append("\n").append(f.getStringTreeFolder());
            f.preStr = "";
        }
        return  builder.toString();
    }

    @Override
    public void addItem(AbstractFile abstractFile) {
        if (!abstractFileList.contains(abstractFile)){
            abstractFileList.add(abstractFile);
            abstractFile.path = this.path + "\\" + abstractFile.path;
        }return;
    }

    @Override
    public void removeItem(AbstractFile abstractFile) {
        if(abstractFileList.contains(abstractFile)){
            abstractFileList.remove(abstractFile);
        }return;
    }
}
