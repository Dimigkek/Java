import java.util.*;

class PhoneBook{
    public static void main(String []argh){
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.get(s)==null){
                System.out.println("Not found");
            }
            else{
                System.out.println(s+"="+phoneBook.get(s));
            }
        }
        in.close();
    }
}