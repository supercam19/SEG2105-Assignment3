public class MyThread extends Thread {
    private String[] notes;
    protected String name;
    public static int delay = 1200;

    public MyThread(String[] notes) {
        this.notes = notes;
    }

    protected boolean isMyNote(String note) {
        return false;
    }

    @Override
    public void run() {
        FilePlayer fp = new FilePlayer();
        for (String note : notes) {
            try {
                if (isMyNote(note)) {
                    fp.play(note);
                    System.out.println(name + ": " + note);
                    sleep(delay);
                } else {
                    sleep(delay);
                }
            } catch (InterruptedException e) {}
        }
    }
}
