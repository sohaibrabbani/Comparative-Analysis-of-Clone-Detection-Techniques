public class XYX {
public int countLines (String filename) throws IOException {

    LineNumberReader reader = new LineNumberReader (new FileReader (filename));

    int cnt = 0;

    String lineRead = "";

    while ((lineRead = reader.readLine ()) != null) {

    }

    cnt = reader.getLineNumber ();

    reader.close ();

    return cnt;

}

}