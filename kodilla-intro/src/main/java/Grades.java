public class Grades {
    private int[] grades;
    private int size;

    public Grades(){
        this.grades = new int[10];
        this.size=0;
    }

    public void add(int value){
        if (this.size > 9){
            return;
        }
        this.grades[size] = value;
        this.size++;
    }

    public int get_lastGrade(){
        if(this.size < 1) {
            return -1;
        }
        return this.grades[this.size-1];
    }

    public double get_average(){
        if(this.size < 1){
            return -1;
        }
        int sum=0;
        for (int i=0;i<this.size;i++){
            sum+=this.grades[i];
        }
        return Double.valueOf(sum)/Double.valueOf(this.size);
    }

}
