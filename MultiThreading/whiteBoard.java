package MultiThreading;

public class whiteBoard {
    String text;
    int numberOfStudent = 0;
    int count=0;
    public void attendence(){
        numberOfStudent++;
    }
   synchronized public void write(String t){
        System.out.println("Teacher has written: "+ t);
        while (count!=0){
            try {
                wait(50);
            }catch (Exception e){}
        }
        text= t;
        count= numberOfStudent;
        notifyAll();
    }
    synchronized public String read(){
        while (count==0){
            try {
                wait(50);
            }catch (Exception e){}
        }
        String t= text;
        count--;
        if (count==0)notifyAll();
        return t;
    }
}
class teacher extends Thread{
    whiteBoard board;
    String notes[] = {"Java is a programming language", "It is an OOP language", "It is platform independent","end"};
    public teacher(whiteBoard board) {
        this.board = board;
    }
    public void run(){
        for (int i = 0; i < notes.length; i++) {
            board.write(notes[i]);
        }
    }
}
class student extends Thread{
    String name;
    whiteBoard board;

    public student(String name, whiteBoard board) {
        this.name = name;
        this.board = board;
    }
    public void run(){
        String text;
        board.attendence();
        do {
            text=board.read();
            System.out.println(name+ " noting "+ text);
        }while (!text.equals("end"));
    }
}
class classroom {
    public static void main(String[] args) {
        whiteBoard board = new whiteBoard();
        teacher t = new teacher(board);
        student s = new student("ankur",board);
        student s1 = new student("anni",board);
        student s2 = new student("abhi",board);
        student s3 = new student("ayush",board);
        student s4 = new student("virat",board);
        t.start();;
        s.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
