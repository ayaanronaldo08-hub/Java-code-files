//import java.util.ArrayList;

public class L14A1 {
    public static void main(String[] args) {
        DataSet obj1 = new DataSet();
        obj1.add(19);
        obj1.add(14);
        obj1.add(11);

        System.out.println("Average: " + obj1.getAverage());
        System.out.println("Standard Deviation: " + obj1.getSD());

        DataSet obj2 = new DataSet();
        obj2.add(10);
        obj2.add(28);
        obj2.add(39);

        System.out.println("Average: " + obj2.getAverage());
        System.out.println("Standard Deviation: " + obj2.getSD());
    }
}

class DataSet{
    private double[] data;
    private int datasize;
    private double sum;

    public DataSet(){
        data = new double[100];
        datasize = 0;
        sum = 0;
    }

    public void add(double value){
        data[datasize] = value;
        datasize ++;
        sum += value;
    }

    public double getAverage(){
        if (datasize == 0){
            return 0;
        } else{
            return (sum/datasize);
        }
    }

    public double getSD(){
        double average = getAverage();
        double total = 0;
        for (int i = 0; i < datasize; i++){
            double diff = data[i] - average;
            total = total + (diff * diff);
        }
        return Math.sqrt(total/datasize);
    }
}