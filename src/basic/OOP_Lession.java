package basic;

public class OOP_Lession {
    public static void main(String[] args) {
        /*
        OOP
        Object-Oriented Programming Language

        Object -->
        Class -->
        Inheritance --> Handover
        Polymorphism --> do the same thing but the condition of occurring in several different forms
        Abstraction --> hide internal data, show function
        Encapsulation --> collect all data in one place
         */
        TextBoxOne mytext = new TextBoxOne();
        mytext.setText("This is My text.");
        System.out.println(mytext.getText());
        System.out.println(mytext.getTextLength());
        mytext.clear();
        System.out.println(mytext.getText());

        var mysecondtext = new TextBoxOne();
        mysecondtext.setText("This is My second text.");
        System.out.println(mysecondtext.getText());
        System.out.println(mysecondtext.getTextLength());
        mysecondtext.clear();
        System.out.println(mysecondtext.getText());
    }
    public static class TextBoxOne{
        String text;
        public TextBoxOne(){

        }
        public void setText(String text){
            this.text = text;
        }
        public String getText(){
            return text;
        }

        public void clear(){
            this.text = null;
        }

        public int getTextLength(){
            return text.length();
        }
    }
}
