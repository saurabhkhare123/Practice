import java.text.SimpleDateFormat;

class Date {
    public static void main(String args[]){
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simple = new SimpleDateFormat(pattern);

        String date=simple.format(new Date());
        System.out.println(date);
    }

}