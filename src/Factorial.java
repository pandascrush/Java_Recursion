// 1st type

//public class Factorial {
//    public int findFact5(int no){
//        return no * findFact4(no-1);
//    }
//
//    private int findFact4(int no) {
//        return no * findFact3(no-1);
//    }
//
//    private int findFact3(int no) {
//        return no * findFact2(no-1);
//    }
//
//    private int findFact2(int no) {
//        return no * findFact1(no-1);
//    }
//
//    private int findFact1(int no) {
//        return 1 ;
//    }
//
//}


// 2nd type
public class Factorial{
    int total = 1;
    public int findFact(int no){
        total = total * no;
        no--;
        if(no > 0)
        findFact(no);

        return total;
    }

}

