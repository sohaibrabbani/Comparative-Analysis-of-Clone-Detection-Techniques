public class XYX {
public void actionPerformed (ActionEvent e) {

    JPanel panel = new JPanel ();

    panel.add (new JLabel ("Hello"));

    panel.setBorder (new MatteBorder (0, 0, 1, 0, Color.GRAY));

    GridBagConstraints gbc = new GridBagConstraints ();

    gbc.gridwidth = GridBagConstraints.REMAINDER;

    gbc.weightx = 1;

    gbc.fill = GridBagConstraints.HORIZONTAL;

    mainList.add (panel, gbc, 0);

    validate ();

    repaint ();

}

}