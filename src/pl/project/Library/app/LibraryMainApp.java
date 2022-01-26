package pl.project.Library.app;

public class LibraryMainApp {

    private static final String APP_NAME="Biblioteka v1.0";
    public static void main(String[] args) {
        final String appName = APP_NAME;
        System.out.println(appName);
        LibraryControl libControl = new LibraryControl();
        libControl.controlLoop();
    }
}
