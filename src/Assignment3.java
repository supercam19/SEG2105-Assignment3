import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        String[] notes = {Note.DO, Note.RE, Note.MI, Note.FA, Note.SOL, Note.LA, Note.SI, Note.DO_OCT};
        MyThread t1 = new Thread1(notes);
        MyThread t2 = new Thread2(notes);
        System.out.println("Playing scale ---");
        t1.start();
        t2.start();
        while (t1.isAlive() || t2.isAlive()) {}
        System.out.println("Playing Twinkle Twinkle Little Star ---");
        MyThread.delay = 400;
        notes = new String[]{Note.DO, Note.DO, Note.SOL, Note.SOL, Note.LA, Note.LA,
                Note.SOL, Note.FA, Note.FA, Note.MI, Note.MI, Note.RE,
                Note.RE, Note.DO, Note.SOL, Note.SOL, Note.FA, Note.FA,
                Note.MI, Note.MI, Note.RE, Note.SOL, Note.SOL, Note.FA,
                Note.FA, Note.MI, Note.MI, Note.RE, Note.DO, Note.DO,
                Note.SOL, Note.SOL, Note.LA, Note.LA, Note.SOL, Note.FA,
                Note.FA, Note.MI, Note.MI, Note.RE, Note.RE, Note.DO};
        t1 = new Thread1(notes);
        t2 = new Thread2(notes);
        t1.start();
        t2.start();
    }
}
