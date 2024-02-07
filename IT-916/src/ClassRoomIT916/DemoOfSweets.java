package ClassRoomIT916;

import java.util.*;
interface Sweet {
    void sweetStatus();
}
class Rasgulla implements Sweet{
    public void sweetStatus()
    {
        System.out.println("Very Sweet");
    }
}
class Sandesh implements Sweet{
    public void sweetStatus()
    {
        System.out.println("Not too sweet");
    }
}
class Burfi implements Sweet{
    public void sweetStatus()
    {
        System.out.println("Sweet");
    }
}
class Jalebi implements Sweet{
    public void sweetStatus()
    {
        System.out.println("Sugary sweet");
    }
}
public class DemoOfSweets {

    public static void main(String[] args) {
        Sweet ptr[] = {
                new Burfi(),
                new Jalebi(),
                new Rasgulla(),
                new Sandesh()
        };
        for (int i=0;i<4;i++)
        {
            ptr[i].sweetStatus();
        }
    }
}
