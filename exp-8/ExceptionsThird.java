class FirstLevel extends Exception { }

class SecondLevel extends FirstLevel { }

class ThirdLevel extends SecondLevel { }

class A {
    void show() throws FirstLevel {
        throw new FirstLevel();
    }
}

class B extends A {
    @Override
    void show() throws SecondLevel {
        throw new SecondLevel();
    }
}

class C extends B {
    @Override
    void show() throws ThirdLevel {
        throw new ThirdLevel();
    }
}

public class ExceptionsThird {
    public static void main(String[] args) {
        System.out.println("Jiya Gosain, 24csu313");

        A obj = new C();

        try {
            obj.show();
        } 
        catch (FirstLevel e) {
            System.out.println("Caught Exception: " + e.getClass().getSimpleName());
        }
    }
}
