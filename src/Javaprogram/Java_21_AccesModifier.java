package Javaprogram;

//public class Java_21_AccesModifier {

    class MyEmployee
    {
        private int id;
        private String name ;

        public String getName()
        {
            return name;
        }
        public void setName(String n)
        {
            name=n;
        }
        public void setId(int i)
        {
            id=i;
        }
        public int getId()
        {
            return id;
        }
    }
    public class Java_21_AccesModifier
    {
    public static void main(String[]args)
    {
        MyEmployee Kuldeep = new MyEmployee();
      //  Kuldeep.id=99;
        //Kuldeep.name="Kuldeep Singh Gour";
       Kuldeep.setName("Kuldeep Singh Gour");
       System.out.println(Kuldeep.getName());
       Kuldeep.setId(99);
       System.out.println(Kuldeep.getId());
    }
}