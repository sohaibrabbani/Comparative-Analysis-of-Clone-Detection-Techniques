public class XYX {
public ServletInputStream getInputStream () throws IOException {

    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream (body);

    return new ServletInputStream () {

        @Override

        public int read () throws IOException {

            return byteArrayInputStream.read ();

        }@Override

        public boolean isFinished () {

            return false;

        }@Override

        public boolean isReady () {

            return false;

        }@Override

        public void setReadListener (ReadListener arg0) {

        }}

    ;

}

}