class Student{

    Student(int num){
        System.out.println("constructor2");
    }

    Student(int num,String name){
        System.out.println("constructor1");
        
    }

}


class Demo{

    public static void main(String[] args) {
        
        Student st = new Student(20,"Manish");


        // Student st;
        System.out.print(st);

    }
}