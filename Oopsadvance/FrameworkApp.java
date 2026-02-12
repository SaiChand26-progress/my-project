package Oopsadvance;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Log{}

class Service{

    @Log
    void run(){
        System.out.println("Service running...");
    }
}

public class FrameworkApp{

    public static void main(String[] args) throws Exception{

        Service s = new Service();

        for(var m : s.getClass().getDeclaredMethods()){

            if(m.isAnnotationPresent(Log.class)){
                m.invoke(s);
            }
        }
    }
}
