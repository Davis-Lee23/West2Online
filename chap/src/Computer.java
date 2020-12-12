public class Computer {
    private Insert component;
    public static void main(String[] args) {
        Insert A = new Keyboard();
        Computer B = new Computer(A);
        B.todo();
    }
    public Computer(Insert component){
        this.component = component;
    }

    public void setComponent(Insert a) {
        this.component = a;
    }
    public Insert getComponent(){
        return component;
    }
    public void todo(){
        component.dosome();
    }
}