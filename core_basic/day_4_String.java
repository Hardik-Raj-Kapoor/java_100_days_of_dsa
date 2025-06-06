public class day_4_String {
    public static void main(String args[]){
        String name  = "Hardik";
        System.out.println(name + " Raj Kapoor");
        System.out.println(name.charAt(2));
        System.out.println(name.concat(" Raj Kapoor"));
        System.out.println(name.hashCode());
        System.out.println(name.length());
        //strings are immutable
        //for mutable string: String Builder and String Buffer are used
        StringBuffer sb = new StringBuffer();
        StringBuffer sbnew = new StringBuffer("Hardik");
        System.out.println(sb.capacity()+ " "+sbnew.capacity());
        System.out.println(sbnew.append(" Raj Kapoor"));
        System.out.println(sbnew.deleteCharAt(2));
        System.out.println(sbnew.insert(2,"r"));
        sbnew.setLength(40);
        System.out.println(sbnew.capacity());
        System.out.println(sbnew.toString());

    }
}
