public class XYX {
public static void deleteRecursive (File path) {

    path.listFiles (new FileFilter () {

        @Override

        public boolean accept (File pathname) {

            if (pathname.isDirectory ()) {

                pathname.listFiles (this);

                pathname.delete ();

            } else {

                pathname.delete ();

            }

            return false;

        }}

    );

    path.delete ();

}

}