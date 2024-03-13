//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    int total = 0;
    int res = 1;
    public static void main(String[] args){
        Main m = new Main();

//        Factorial f = new Factorial();
//        int FactResult =  f.findFact(5);
//        System.out.println(FactResult);

          AddNNumbers add = new AddNNumbers();
          int AddNumbers =  add.addnNumber(5);
          System.out.println(AddNumbers);
    }
}