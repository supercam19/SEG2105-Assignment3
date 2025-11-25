public class Thread1 extends MyThread {

    public Thread1(String[] notes) {
        super(notes);
        name = "Thread 1";
    }

    @Override
    protected boolean isMyNote(String note) {
        return note.equals(Note.DO) || note.equals(Note.MI) || note.equals(Note.SI)
                || note.equals(Note.SOL) || note.equals(Note.DO_OCT);
    }
}
