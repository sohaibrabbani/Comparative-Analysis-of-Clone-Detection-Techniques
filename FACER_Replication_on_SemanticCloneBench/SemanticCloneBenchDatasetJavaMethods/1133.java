public class XYX {
private String readFileAsString (String filePath) throws IOException {

    StringBuffer fileData = new StringBuffer ();

    BufferedReader reader = new BufferedReader (new FileReader (filePath));

    char [] buf = new char [1024];

    int numRead = 0;

    while ((numRead = reader.read (buf)) != - 1) {

        String readData = String.valueOf (buf, 0, numRead);

        fileData.append (readData);

    }

    reader.close ();

    return fileData.toString ();

}

}