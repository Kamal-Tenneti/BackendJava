package Arrays;

public class SDarrays{
    public static void main(String[] args) {
        //declaring an Arrays
        //int[] marks;
        //marks =new int[5];
        //or
        //int[] marks = new int[] {10,20,30,40,50};

        //Declaring and Assign
        int[] marks = new int[5];
        marks[0]=100;
        marks[1]=60;
        marks[2]=70;
        marks[3]=80;
        marks[4]=98;

     
        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        
    }
}