package practise.javapra4;

public class testPerson {
    public static void main(String[] args) {
        Student s=new Student("ZI-O","男",12,"中国","南京金陵",11);
        s.show();
        s.work();

        Worker w=new Worker("张三","男",22,"中国","中建",2);
        w.show();
        w.work();

        StudentLeader sl=new StudentLeader("W","男",12,"中国","南京金陵",13,"学生会主席");
        sl.show();
        sl.meeting();
    }

}
