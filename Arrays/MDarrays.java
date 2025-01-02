package Arrays;

public class MDarrays{
    public static void main(String[] args) {
        int marks[][]={
            {1,2,3,4,5},
            {2,3,4,5,6},
            {3,4,5,6,7}
        };
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                System.out.print(marks[i][j]+"\t");
            }
            System.out.println();
        }
    }
}