public class AddNNumbers {
    int result = 0;
    public int addnNumber(int no){
//        System.out.println(no);
        result = result + no;
        no--;
        if(no>0)
        addnNumber(no);

        return result;
    }


}
