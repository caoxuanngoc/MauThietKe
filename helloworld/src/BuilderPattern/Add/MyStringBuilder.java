/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BuilderPattern.Add;

/**
 *
 * @author DELL
 */
public class MyStringBuilder {
    String str;

    public MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return "MyStringBuilder{" +
                "str='" + str + '\'' +
                '}';
    }

    public static class Builder{
        String str = "Xuan Ngoc";
        public Builder addString(String s){
            this.str = str + s;
            return this;
        }
        public Builder addFloat(Float f){
            this.str = str + f;
            return this;
        }
        public Builder addBool(Boolean b){
            this.str = str + b;
            return this;
        }
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}
