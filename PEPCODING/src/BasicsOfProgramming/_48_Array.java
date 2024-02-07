package BasicsOfProgramming;

public class _48_Array {
    public static void main(String[] args){
        int [] marks;
        marks = new int[5];
        marks[0] = 93;
        marks[1] = 43;
        marks[2] = 73;
        marks[3] = 33;
        marks[4] = 53;
        //System.out.println(marks.length);

        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
    }
}
