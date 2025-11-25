public class Thread2 extends MyThread {

    public Thread2(String[] notes) {
        super(notes);
        name = "Thread 2";
    }

    @Override
    protected boolean isMyNote(String note) {
        return note.equals(Note.RE) || note.equals(Note.FA)
                || note.equals(Note.LA) || note.equals(Note.DO_OCT);
    }
}
