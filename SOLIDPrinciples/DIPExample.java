package SOLIDPrinciples;

interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing...");
    }
}

class Computer {
    private Keyboard keyboard;

    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void start() {
        keyboard.type();
    }
}

public class DIPExample {
    public static void main(String[] args) {
        Keyboard keyboard = new WiredKeyboard();
        Computer pc = new Computer(keyboard);
        pc.start();
    }
}