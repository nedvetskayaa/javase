public class Main {

    public static void main(String[] args) {
       /*Student olya= new Student();
       olya.name = "Olya" ;
       olya.surname = "Petrexina";
       olya.age = 17;
       System.out.println(olya);*/
           String Compliment[] = {" clever", " beautiful", " curved", " deaf", " cheerful"}; // my compliment
          Student Student[] = new Student[5];
          //(int) Math.random() * 5;

        Student[0] = new Student();
        Student[0].name = "Ann";
        Student[0].surname = "Nedvetskaya";
        Student[0].age = 16;
        System.out.println(Student [0] + Compliment[0+(int) Math.random()*5] );

        Student[1] = new Student();
        Student[1].name = "Vlad";
        Student[1].surname = "Sorokov";
        Student[1].age = 17;
        System.out.println(Student[1] + Compliment[1+(int) Math.random()*5] );

        Student[2] = new Student();
        Student[2].name = "Petya";
        Student[2].surname = "Pushkin";
        Student[2].age = 18;
        System.out.println(Student[2] + Compliment[2+(int) Math.random()*5]);

        Student[3] = new Student();
        Student[3].name = "Vladlen";
        Student[3].surname = "Myxin";
        Student[3].age = 17;
        System.out.println(Student[3] + Compliment[3+(int) Math.random()*5]);

        Student[4] = new Student();
        Student[4].name = "Katya";
        Student[4].surname = "Skovorodkina";
        Student[4].age = 17;
        System.out.println(Student[4] + Compliment[1+(int) Math.random()*5]);






    }
}

