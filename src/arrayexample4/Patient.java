
package arrayexample4;


public class Patient {
    String name;
    double weight;
    double height;
    double bmi;
    
    public void calculateBmi(){
        bmi = weight / (height*height);
    }
    
}
